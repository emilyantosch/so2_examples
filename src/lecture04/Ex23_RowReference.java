/*
 * Lecture 4 – Row References and Copied Values (slides_004/main.typ:475)
 * Question: What will this print?
 */
package lecture04;

public class Ex23_RowReference {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int[] b = a[0];
        int c = b[1];

        b[1] = 7;
        System.out.println(a[0][1]);
        System.out.println(c);
    }
}

// Answer:
// 7
// 2
// b refers to row a[0] (same array); c is a copy of the int value.
