/*
 * Lecture 5 – Calling the Superclass Implementation (slides_005/main.typ:494)
 * Demo: Inside `Pilot`: toStringOfSuperClass() returns super.toString().
 */
package lecture05;

public class Ex15_SuperToString {

    static class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    static class Pilot extends Person {
        private String airline;
        public Pilot(String name, String airline) {
            super(name);
            this.airline = airline;
        }
        @Override
        public String toString() {
            return String.format("%s (%s)", getName(), airline);
        }
        public String toStringOfSuperClass() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot("Jan Birgerson", "Winglet Airways");
        System.out.println(pilot.toString());
        System.out.println(pilot.toStringOfSuperClass());
    }
}

// Output:
// Jan Birgerson (Winglet Airways)
// Jan Birgerson
