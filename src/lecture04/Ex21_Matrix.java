/*
 * Lecture 4 – Arrays of Arrays (slides_004/main.typ:439, 452)
 * Demo: A matrix is an array of row arrays.
 */
package lecture04;

import java.util.Arrays;

public class Ex21_Matrix {

    public static void main(String[] args) {
        int[][] filter = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        for (int i = 0; i < filter.length; i++) {
            System.out.println(Arrays.toString(filter[i]));
        }

        int[][] zeros = new int[3][4];
        System.out.println(Arrays.deepToString(zeros));
    }
}

// Output:
// [1, 2, 3]
// [4, 5, 6]
// [7, 8, 9]
// [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
