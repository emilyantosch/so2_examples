/*
 * Lecture 5 – Runtime Type Selects the Method (slides_005/main.typ:476)
 * Question: Does the reference type change the output?
 */
package lecture05;

public class Ex14_RuntimeDispatch {

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
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot("Jan Birgerson", "Winglet Airways");
        Object objectRef = pilot;
        Person personRef = pilot;
        System.out.println(objectRef.toString());
        System.out.println(personRef.toString());
    }
}

// Answer: No. Both print "Jan Birgerson (Winglet Airways)".
// The runtime object type (Pilot) selects the overridden instance method.
