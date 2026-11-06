/*
 * Lecture 8 – A Nested Handler (slides_008/main.typ:358)
 * Demo: A try inside the catch handles the failure raised in the handler.
 */
package lecture08;

public class Ex12_NestedHandler {
    static int recursiveIncrease(int i) {
        return recursiveIncrease(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        try {
            a[4] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                recursiveIncrease(7);
            } catch (StackOverflowError inner) {
                System.out.println("Caught inner StackOverflowError");
            }
        }
        System.out.println("Continuing after the handler");
    }
}

// Expected output:
// Caught inner StackOverflowError
// Continuing after the handler
