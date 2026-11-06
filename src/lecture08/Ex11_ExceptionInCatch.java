/*
 * Lecture 8 – An Exception Inside a Catch (slides_008/main.typ:332)
 * Question: Is the new failure handled? Predict the output.
 */
package lecture08;

public class Ex11_ExceptionInCatch {
    static int recursiveIncrease(int i) {
        return recursiveIncrease(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            a[4] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            recursiveIncrease(7);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError");
        }
        System.out.println("Exiting main()");
    }
}

// Answer:
// No. Sibling catches only protect the try block, not each other.
// a[4] = 0 throws ArrayIndexOutOfBoundsException -> first catch runs -> StackOverflowError
// escapes the whole try statement:
// Exception in thread "main" java.lang.StackOverflowError (long stack trace)
// Nothing else is printed.
