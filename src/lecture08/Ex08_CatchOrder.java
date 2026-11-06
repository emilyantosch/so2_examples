/*
 * Lecture 8 – Put Specific Types First (slides_008/main.typ:272)
 * Demo: NumberFormatException extends IllegalArgumentException.
 *       Reversing these catches makes the first case unreachable.
 */
package lecture08;

public class Ex08_CatchOrder {
    public static void main(String[] args) {
        check("12a4");
        check("-5");
        check("42");
    }

    static void check(String text) {
        try {
            int value = Integer.parseInt(text);
            if (value < 0) {
                throw new IllegalArgumentException("Negative: " + value);
            }
            System.out.println("Valid: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric text: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Other invalid argument: " + e.getMessage());
        }

        // Reversed order:
        // try {
        //     Integer.parseInt(text);
        // } catch (IllegalArgumentException e) {
        // } catch (NumberFormatException e) { // COMPILE ERROR: exception NumberFormatException has already been caught
        // }
    }
}

// Expected output:
// Invalid numeric text: For input string: "12a4"
// Other invalid argument: Negative: -5
// Valid: 42
