/*
 * Lecture 8 – Finally During Propagation (slides_008/main.typ:404)
 * Question: What is printed before the uncaught error? Use recursiveIncrease as before.
 */
package lecture08;

public class Ex14_FinallyPropagation {
    static int recursiveIncrease(int i) {
        return recursiveIncrease(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            a[4] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            recursiveIncrease(7);
            System.out.println("Caught invalid index");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Exiting main()");
    }
}

// Answer:
// Finally
// Exception in thread "main" java.lang.StackOverflowError (long stack trace)
// "Caught invalid index" and "Exiting main()" are never printed.
