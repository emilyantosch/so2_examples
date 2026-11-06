/*
 * Lecture 4 – Arrays of Arrays (slides_004/main.typ:458)
 * Question: What will this print?
 */
package lecture04;

public class Ex22_MatrixQuestion {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(a.length);
        System.out.println(a[2].length);
        System.out.println(a[1][1]);
        System.out.println(a[2][0]);
    }
}

// Answer:
// 3
// 2
// 4
// 5
