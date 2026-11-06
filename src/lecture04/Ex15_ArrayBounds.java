/*
 * Lecture 4 – Array Length and Indices (slides_004/main.typ:341)
 * Demo: `filter[-1]` and `filter[3]` are outside this array.
 */
package lecture04;

public class Ex15_ArrayBounds {

    public static void main(String[] args) {
        int[] filter = {0, 1, 4};
        System.out.println(filter[filter.length - 1]); // last valid index: length - 1
        System.out.println(filter[3]);                 // ArrayIndexOutOfBoundsException
    }
}

// Output:
// 4
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
