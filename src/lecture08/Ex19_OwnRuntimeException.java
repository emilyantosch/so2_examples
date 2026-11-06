/*
 * Lecture 8 – Alternative: An Unchecked Custom Exception (slides_008/main.typ:535)
 * Demo: No catch or throws declaration is required. A caller can still catch it.
 */
package lecture08;

public class Ex19_OwnRuntimeException {
    static class NegativeParamException extends RuntimeException {}

    public static void main(String[] args) {
        System.out.println(squareRoot(25.0));
        try {
            System.out.println(squareRoot(-4.0));
        } catch (NegativeParamException e) {
            System.out.println("Caught NegativeParamException");
        }
    }

    public static double squareRoot(double x) {
        if (x < 0.0) {
            throw new NegativeParamException();
        }
        return Math.sqrt(x);
    }
}

// Expected output:
// 5.0
// Caught NegativeParamException
