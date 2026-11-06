/*
 * Lecture 4 – Array Length and Indices (slides_004/main.typ:330)
 * Question: Which values does the loop store?
 */
package lecture04;

import java.util.Arrays;

public class Ex14_ArrayLoop {

    public static void main(String[] args) {
        int[] filter = new int[3];
        for (int i = 0; i < filter.length; i++) {
            filter[i] = i * i;
        }
        System.out.println(Arrays.toString(filter));
    }
}

// Answer:
// [0, 1, 4]
