/*
 * Lecture 2 – Jump Statements (slides_002/main.typ:694)
 * Question: What does this print?
 */
package lecture02;

public class Ex32_Break {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}

// Answer:
// i = 0
// i = 1
// break exits the loop at i == 2.
