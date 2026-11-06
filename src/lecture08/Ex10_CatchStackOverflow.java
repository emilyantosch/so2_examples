/*
 * Lecture 8 – Catch Either Failure Type (slides_008/main.typ:310)
 * Task: Add a catch for StackOverflowError. Use recursiveIncrease from the previous slide.
 */
package lecture08;

public class Ex10_CatchStackOverflow {
    static int recursiveIncrease(int i) {
        return recursiveIncrease(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            a[4] = recursiveIncrease(7);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught invalid index");
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError");
        }
        System.out.println("Exiting main()");
    }
}

// Expected output:
// Caught StackOverflowError
// Exiting main()
