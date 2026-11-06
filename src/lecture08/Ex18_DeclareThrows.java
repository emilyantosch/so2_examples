/*
 * Lecture 8 – Declare with throws (slides_008/main.typ:508)
 * Demo: throws declares a possible failure; throw actually raises it.
 *       Declaring it in main does not handle it.
 */
package lecture08;

public class Ex18_DeclareThrows {
    static class NegativeParamException extends Exception {}

    public static void main(String[] args)
            throws NegativeParamException {
        System.out.println(squareRoot(25.0));
        // System.out.println(squareRoot(-4.0)); // uncomment: uncaught, program ends with a stack trace
    }

    public static double squareRoot(double x)
            throws NegativeParamException {
        if (x < 0.0) {
            throw new NegativeParamException();
        }
        return Math.sqrt(x);
    }
}

// Expected output:
// 5.0
