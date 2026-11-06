/*
 * Lecture 8 – Predict the Output (slides_008/main.typ:45)
 * Question: What is printed for (3, 2)? What changes for (7, 0)?
 */
package lecture08;

public class Ex01_ProvokeException {
    public static void main(String[] args) {
        printRatio(3, 2);
        // printRatio(7, 0); // uncomment for the second case
        System.out.println("Exiting main()");
    }

    public static void printRatio(int a, int b) {
        int ratio = a / b;
        System.out.println("Ratio = " + ratio);
    }
}

// Answer:
// (3, 2): integer division ->
//   Ratio = 1
//   Exiting main()
// (7, 0): "Exception in thread "main" java.lang.ArithmeticException: / by zero"
//   plus a stack trace. Neither "Ratio = ..." nor "Exiting main()" is printed.
