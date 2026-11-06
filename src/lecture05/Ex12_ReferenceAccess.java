/*
 * Lecture 5 – Reference Type Controls Access (slides_005/main.typ:387)
 * Question: Which accesses compile? Assume all classes are in the same package.
 */
package lecture05;

public class Ex12_ReferenceAccess {

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }
    }

    static class Pilot extends Person {
        String airline;

        public Pilot(String name, String airline) {
            super(name);
            this.airline = airline;
        }
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot("Birgit", "Winglet Airways");
        Person personRef = pilot;
        Object objectRef = pilot;

        System.out.println(personRef.name);
        // System.out.println(personRef.airline);
        // System.out.println(objectRef.name);
        // System.out.println(objectRef.airline);
    }
}

// Answer: only personRef.name compiles.
// COMPILE ERROR personRef.airline: cannot find symbol -- Person declares no airline
// COMPILE ERROR objectRef.name:     cannot find symbol -- Object declares no name
// COMPILE ERROR objectRef.airline:  cannot find symbol -- Object declares no airline
// The reference type (not the object) decides which members are available.
// The object is still a Pilot: ((Pilot) objectRef).airline would compile.
