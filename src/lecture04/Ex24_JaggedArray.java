/*
 * Lecture 4 – Jagged Arrays (slides_004/main.typ:493)
 * Task: Use a `for` loop to create three rows with lengths 1, 2, and 3.
 */
package lecture04;

import java.util.Arrays;

public class Ex24_JaggedArray {

    public static void main(String[] args) {
        int[][] a = new int[3][];
        System.out.println(Arrays.deepToString(a)); // rows not created yet

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
        }
        System.out.println(Arrays.deepToString(a));
    }
}

// Output:
// [null, null, null]
// [[0], [0, 0], [0, 0, 0]]
