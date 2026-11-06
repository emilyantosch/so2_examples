/*
 * Lecture 5 – Which Implementation Runs? (slides_005/main.typ:417, 438, 455)
 * Question: What will this print?
 */
package lecture05;

public class Ex13_ToStringOverride {

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
        Person person = new Person("Birgit Janssen");
        System.out.println(person);
        System.out.println(person.toString());

        Pilot pilot = new Pilot("Jan Birgerson", "Winglet Airways");
        System.out.println(pilot.toString());
    }
}

// Answer:
// Birgit Janssen
// Birgit Janssen
// Jan Birgerson (Winglet Airways)
// println(person) calls person.toString() internally.
