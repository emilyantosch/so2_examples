/*
 * Lecture 6 – What Can an Interface Declare? (slides_006/main.typ:136)
 * Demo: abstract method, constant field, default method, static method, private helper.
 */
package lecture06;

public class Ex06_InterfaceMembers {

    interface Greeter {
        String PREFIX = "Hello";          // implicitly public static final

        String getName();                 // implicitly public abstract

        default String greet() {          // inherited instance implementation (Java 8+)
            return decorate(PREFIX + ", " + getName());
        }

        static Greeter of(String name) {  // called on the interface; not inherited (Java 8+)
            return new Greeter() {
                @Override
                public String getName() {
                    return name;
                }
            };
        }

        private String decorate(String text) {  // private helper (Java 9+)
            return text + "!";
        }
    }

    static class Student implements Greeter {
        @Override
        public String getName() {
            return "Birgit";
        }
    }

    public static void main(String[] args) {
        Greeter student = new Student();
        System.out.println(student.greet());
        System.out.println(Greeter.of("Jan").greet());
        System.out.println(Greeter.PREFIX);
        // COMPILE ERROR: cannot assign a value to final variable PREFIX
        // Greeter.PREFIX = "Hi";
        // COMPILE ERROR: Greeter is abstract; cannot be instantiated (interfaces have no constructors)
        // Greeter g = new Greeter();
    }
}
