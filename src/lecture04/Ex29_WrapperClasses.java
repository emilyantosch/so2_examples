/*
 * Lecture 4 – Wrapper Classes (slides_004/main.typ:621)
 * Demo: Generic types require reference types: `ArrayList<Integer>`, not `ArrayList<int>`.
 */
package lecture04;

import java.util.ArrayList;

public class Ex29_WrapperClasses {

    public static void main(String[] args) {
        // COMPILE ERROR: unexpected type, required: reference, found: int
        // ArrayList<int> numbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(42);
        System.out.println(numbers);

        // Wrappers also provide constants and helpers
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Character.isDigit('7'));
        System.out.println(Boolean.parseBoolean("true"));
    }
}

// Output:
// [7, 42]
// 2147483647
// 4.9E-324
// true
// true
