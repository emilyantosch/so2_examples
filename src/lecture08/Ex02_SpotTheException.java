/*
 * Lecture 8 – Spot the Exception (slides_008/main.typ:75)
 * Question: Evaluate each snippet independently.
 * Change `snippet` to 1, 2 or 3.
 */
package lecture08;

public class Ex02_SpotTheException {
    public static void main(String[] args) {
        int snippet = 1;

        if (snippet == 1) {
            int[] array = {1, 2, 3, 4};
            System.out.println(array[4]);
        } else if (snippet == 2) {
            String message = null;
            System.out.println(message.length());
        } else if (snippet == 3) {
            int code = Integer.parseInt("12a4");
        }

        // An uninitialized local variable is a compile-time error, not a null reference:
        // String text;
        // System.out.println(text.length()); // COMPILE ERROR: variable text might not have been initialized
    }
}

// Answer:
// 1: ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
// 2: NullPointerException (Cannot invoke "String.length()" because "message" is null)
// 3: NumberFormatException: For input string: "12a4"
