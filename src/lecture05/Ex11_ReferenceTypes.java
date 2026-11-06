/*
 * Lecture 5 – One Object, Several Reference Types (slides_005/main.typ:341, 377)
 * Demo: Three references, one object, runtime type stays Pilot.
 */
package lecture05;

public class Ex11_ReferenceTypes {

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

        System.out.println(pilot == personRef);   // same object
        System.out.println(pilot == objectRef);   // same object
        System.out.println(objectRef.getClass().getSimpleName());  // runtime type: Pilot
    }
}
