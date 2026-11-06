/*
 * Lecture 4 – Creating Arrays (slides_004/main.typ:293, 298, 307, 318)
 * Demo: Creation with `new`, assigning elements, array initializers.
 */
package lecture04;

import java.util.Arrays;

public class Ex13_CreatingArrays {

    public static void main(String[] args) {
        int[] filter = new int[3];
        System.out.println(Arrays.toString(filter)); // default elements

        filter[0] = 1;
        filter[1] = 2;
        filter[2] = 1;
        System.out.println(Arrays.toString(filter));

        int[] filter2 = {1, 2, 1};
        int[] filter3 = new int[] {1, 2, 1};
        System.out.println(Arrays.toString(filter2) + " " + Arrays.toString(filter3));

        // Default elements for other types
        System.out.println(Arrays.toString(new double[2]));
        System.out.println(Arrays.toString(new boolean[2]));
        System.out.println(Arrays.toString(new String[2]));

        int legal[] = {1, 2, 1}; // compiles, but prefer int[] legal
        System.out.println(filter); // printing the array itself shows a reference, e.g. [I@1b6d3586
    }
}
