/*
 * Lecture 3 – Constructors: Examples (slides_003/main.typ:660)
 * Question: Will `new Aircraft()` compile with this class?
 */
package lecture03;

public class Ex22_MissingNoArgConstructor {

    static class Aircraft {
        String model;
        Aircraft(String model) {
            this.model = model;
        }
    }

    public static void main(String[] args) {
        // COMPILE ERROR: constructor Aircraft in class Aircraft cannot be applied to given types
        // Aircraft aircraft = new Aircraft();
        Aircraft aircraft = new Aircraft("A320");
        System.out.println(aircraft.model);
    }
}

// Answer: No. Only Aircraft(String) exists; once you write any constructor,
// the compiler no longer generates the default constructor Aircraft().
