/*
 * Lecture 8 – Two Failures, One Evaluation Order (slides_008/main.typ:289)
 * Question: Which failure happens first? What is printed?
 */
package lecture08;

public class Ex09_EvaluationOrder {
    static int recursiveIncrease(int i) {
        return recursiveIncrease(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            a[4] = recursiveIncrease(7);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught invalid index");
        }
        System.out.println("Exiting main()");
    }
}

// Answer:
// The right-hand side runs before the bounds check, so StackOverflowError happens first.
// It is not caught (it is an Error, not an ArrayIndexOutOfBoundsException):
// Exception in thread "main" java.lang.StackOverflowError (long stack trace)
// Neither "Caught invalid index" nor "Exiting main()" is printed.
