/*
 * Lecture 2 – Jump Statements (slides_002/main.typ:706)
 * Question: What changes with continue?
 */
package lecture02;

public class Ex33_Continue {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}

// Answer:
// i = 0
// i = 1
// i = 3
// i = 4
// continue skips only the rest of the body for i == 2; the update i++ still runs.
