/*
 * Lecture 8 – Write Cleanup Last (slides_008/main.typ:387)
 * Demo: Finally runs when control leaves try / catch, with and without a failure.
 * Also: Valid Block Combinations (line 447): try / finally without a catch.
 */
package lecture08;

public class Ex13_FinallyCleanup {
    public static void main(String[] args) {
        useResource("42");
        useResource("12a4");

        try {
            cleanupWithoutHandler();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main(): " + e.getMessage());
        }
    }

    static void useResource(String text) {
        System.out.println("Open resource");
        try {
            System.out.println("Value: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Handle: " + e.getMessage());
        } finally {
            System.out.println("Close resource");
        }
    }

    static void cleanupWithoutHandler() {
        try {
            System.out.println("Ratio = " + (3 / 0)); // may throw; no local recovery
        } finally {
            System.out.println("Cleanup before propagation");
        }
    }
}

// Expected output:
// Open resource
// Value: 42
// Close resource
// Open resource
// Handle: For input string: "12a4"
// Close resource
// Cleanup before propagation
// Caught in main(): / by zero
