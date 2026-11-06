/*
 * Lecture 2 – Short-Circuit Evaluation (slides_002/main.typ:404)
 * Question: What is the final value of a?
 */
package lecture02;

public class Ex15_ShortCircuit {

    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println((++a == b) || (a++ > b));
        System.out.println("a = " + a);
    }
}

// Answer: true, then a = 4. ++a makes a 4, so 4 == 4 is true and
//         || skips the right operand: a++ never runs.
//         Try live: replace || with | (no short circuit) -> a = 5.
