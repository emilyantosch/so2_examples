/*
 * Lecture 3 – Constructors: Examples (slides_003/main.typ:645)
 * Question: Will this compile?
 */
package lecture03;

public class Ex21_ImplicitDefaultConstructor {

    static class Aircraft {
        String model;
    }

    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        System.out.println(aircraft.model);
    }
}

// Answer: Yes. The compiler supplies Aircraft(). Prints: null
