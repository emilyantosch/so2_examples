/*
 * Lecture 5 – Fields Are Not Overridden (slides_005/main.typ:510)
 * Demo: Suppose both `Person` and `Pilot` declare a public field named `name`.
 *       Static methods are also selected by compile-time type, not runtime dispatch.
 */
package lecture05;

public class Ex17_FieldHiding {

    static class Person {
        public String name = "Person field";

        @Override
        public String toString() {
            return "Person.toString()";
        }
        public static String describe() {
            return "Person.describe()";
        }
    }

    static class Pilot extends Person {
        public String name = "Pilot field";  // hides Person.name -- avoid this

        @Override
        public String toString() {
            return "Pilot.toString()";
        }
        public static String describe() {    // hides Person.describe()
            return "Pilot.describe()";
        }
    }

    public static void main(String[] args) {
        Person ref = new Pilot();
        System.out.println(ref.name);          // compile-time type Person
        System.out.println(ref.toString());    // runtime type Pilot
        System.out.println(((Pilot) ref).name);
        System.out.println(Person.describe());
        System.out.println(Pilot.describe());
    }
}

// Output:
// Person field
// Pilot.toString()
// Pilot field
// Person.describe()
// Pilot.describe()
