/*
 * Lecture 4 – Returning Arrays (slides_004/main.typ:390)
 * Question: What will this print?
 */
package lecture04;

public class Ex19_ReturningArrays {

    static int[] createSortedArray(int a, int b) {
        if (a < b) {
            return new int[] {a, b};
        } else {
            return new int[] {b, a};
        }
    }

    public static void main(String[] args) {
        System.out.println(createSortedArray(7, 4)[1]);
    }
}

// Answer:
// 7
// The method returns {4, 7}; index 1 is the larger value.
