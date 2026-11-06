/*
 * Lecture 4 – Sorting an Array (slides_004/main.typ:410)
 * Task: Write a method that sorts an `int[]` in ascending order.
 *       Test it with `{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 7}`.
 */
package lecture04;

import java.util.Arrays;

public class Ex20_SortArray {

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                if (i > 0) i--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 7};
        sort(a); // sorts in place: the method receives a copy of the reference
        System.out.println(Arrays.toString(a));
    }
}

// Output:
// [1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10]
