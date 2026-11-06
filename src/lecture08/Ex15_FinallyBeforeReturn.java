/*
 * Lecture 8 – Finally Before a Return (slides_008/main.typ:425)
 * Question: Predict the output of System.out.println("Ratio = " + getRatio(3, 0)).
 */
package lecture08;

public class Ex15_FinallyBeforeReturn {
    public static void main(String[] args) {
        System.out.println("Ratio = " + getRatio(3, 0));
    }

    public static int getRatio(int a, int b) {
        int ratio = 0;
        try {
            ratio = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Caught in getRatio()");
            return 0;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Exiting getRatio()");
        return ratio;
    }
}

// Answer:
// Caught in getRatio()
// Finally
// Ratio = 0
// ("Exiting getRatio()" is skipped: the return in catch leaves the method after finally.)
