/*
 * Lecture 8 – Give a Domain Failure a Type (slides_008/main.typ:463)
 * Task: Define NegativeParamException and throw it when x < 0.
 */
package lecture08;

public class Ex16_SquareRootTask {
    static class NegativeParamException extends Exception {
        public NegativeParamException(String message) {
            super(message);
        }
    }

    // Before: Math.sqrt returns NaN for negative input.
    public static double squareRootOld(double x) {
        return Math.sqrt(x);
    }

    // After: reject negative input with a domain-specific (checked) exception.
    public static double squareRoot(double x) throws NegativeParamException {
        if (x < 0.0) {
            throw new NegativeParamException("Negative parameter: " + x);
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        System.out.println(squareRootOld(-4.0));
        try {
            System.out.println(squareRoot(25.0));
            System.out.println(squareRoot(-4.0));
        } catch (NegativeParamException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

// Expected output:
// NaN
// 5.0
// Caught: Negative parameter: -4.0
