/*
 * Lecture 4 – Array References (slides_004/main.typ:361)
 * Question: What will this print?
 */
package lecture04;

public class Ex17_ArrayAlias {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a;
        b[3] = 0;
        System.out.println(b[2]);
        System.out.println(a[3]);
    }
}

// Answer:
// 3
// 0
// a and b refer to the same array.
