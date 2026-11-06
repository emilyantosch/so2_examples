/*
 * Lecture 8 – Task: Keep the Caller Running (slides_008/main.typ:186)
 * Task: Catch the division failure inside printRatio. Let main reach its final print statement.
 * Solution: Handle the Failure Locally (line 199).
 */
package lecture08;

public class Ex04_CatchInPrintRatio {
    public static void main(String[] args) {
        printRatio(3, 0);
        System.out.println("Exiting main()");
    }

    public static void printRatio(int a, int b) {
        try {
            int ratio = a / b;
            System.out.println("Ratio = " + ratio);
        } catch (ArithmeticException e) {
            System.out.println("Caught in printRatio()");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("Exiting printRatio()");
    }
}

// Expected output:
// Caught in printRatio()
// / by zero
// java.lang.ArithmeticException: / by zero
// Exiting printRatio()
// Exiting main()
