/*
 * Lecture 8 – Task: Reject a Zero Divisor (slides_008/main.typ:118)
 * Task: Throw ArithmeticException before dividing if b is zero. Include a message.
 * Also: An Explicit Guard (line 131), Read a Stack Trace (line 152).
 */
package lecture08;

public class Ex03_ThrowException {
    public static void main(String[] args) {
        printRatio(3, 0);
        System.out.println("Exiting main()"); // never reached
    }

    public static void printRatio(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
            // Same effect, object created first (slide line 108):
            // ArithmeticException problem =
            //     new ArithmeticException("Division by zero");
            // throw problem;
        }
        System.out.println("Ratio = " + (a / b));
    }
}

// Expected output (stack trace on System.err):
// Exception in thread "main" java.lang.ArithmeticException: Division by zero
//     at lecture08.Ex03_ThrowException.printRatio(Ex03_ThrowException.java:16)
//     at lecture08.Ex03_ThrowException.main(Ex03_ThrowException.java:10)
// Read bottom-up: main called printRatio, which threw in line 16.
