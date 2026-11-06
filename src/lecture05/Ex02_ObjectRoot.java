/*
 * Lecture 5 – Object: The Root Class (slides_005/main.typ:115, 129)
 * Question: Which superclass does Person have?
 * Demo: Every class inherits instance methods from `Object`, including `toString()`.
 */
package lecture05;

public class Ex02_ObjectRoot {

    static class Person {
        String name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Lukas Luft";
        System.out.println(person.toString());

        System.out.println("Superclass of Person: " + Person.class.getSuperclass());
        System.out.println("Superclass of Object: " + Object.class.getSuperclass());

        // COMPILE ERROR: Java has no multiple inheritance of classes (only one direct superclass)
        // class Invalid extends Person, Object { }
    }
}

// Answer: Person implicitly extends java.lang.Object.
// Default toString() prints class name + '@' + hex hash code, e.g. lecture05.Ex02_ObjectRoot$Person@1b6d3586
// (the hash differs between runs) -- not the name field. Object itself has no superclass (null).
