/*
 * Lecture 8 – Catch Locally: Is Zero a Valid Result? (slides_008/main.typ:223)
 * Question: Is zero a valid result?
 */
package lecture08;

public class Ex06_GetRatioCatchLocally {
    public static void main(String[] args) {
        System.out.println("Ratio = " + getRatio(3, 0));
        System.out.println("Exiting main()");
    }

    public static int getRatio(int a, int b) {
        int ratio = 0;
        try {
            ratio = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Caught in getRatio()");
        }
        System.out.println("Exiting getRatio()");
        return ratio;
    }
}

// Answer:
// Caught in getRatio()
// Exiting getRatio()
// Ratio = 0
// Exiting main()
// Zero is not a valid result here: getRatio(0, 3) also returns 0, so the caller
// cannot tell a real result from a failure. Better let the caller handle it (next example).
