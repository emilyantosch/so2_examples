/*
 * Lecture 8 – Catch in the Caller (slides_008/main.typ:245)
 * Demo: The exception propagates out of getRatio and is handled in main.
 */
package lecture08;

public class Ex07_CatchInCaller {
    public static void main(String[] args) {
        try {
            int ratio = getRatio(3, 0);
            System.out.println("Ratio = " + ratio);
        } catch (ArithmeticException e) {
            System.out.println("Caught in main()");
        }
        System.out.println("Exiting main()");
    }

    public static int getRatio(int a, int b) {
        int ratio = a / b;
        System.out.println("Exiting getRatio()");
        return ratio;
    }
}

// Expected output:
// Caught in main()
// Exiting main()
// ("Exiting getRatio()" and "Ratio = ..." are skipped.)
