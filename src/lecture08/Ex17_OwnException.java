/*
 * Lecture 8 – Why Does This Not Compile? (slides_008/main.typ:481)
 * Question: The compiler reports an unhandled checked exception, even with positive input in main.
 */
package lecture08;

public class Ex17_OwnException {
    static class NegativeParamException extends Exception {}

    public static void main(String[] args) {
        System.out.println(squareRoot(25.0));
    }

    public static double squareRoot(double x) {
        if (x < 0.0) {
            // throw new NegativeParamException(); // COMPILE ERROR: unreported exception NegativeParamException; must be caught or declared to be thrown
        }
        return Math.sqrt(x);
    }
}

// Answer:
// NegativeParamException extends Exception, so it is a checked exception.
// The compiler checks every possible throw, not the actual input value:
// squareRoot must either catch it or declare `throws NegativeParamException`
// (and then main must do the same). See Ex18_DeclareThrows.
