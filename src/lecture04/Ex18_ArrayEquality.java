/*
 * Lecture 4 – Array References (slides_004/main.typ:376)
 * Question: What will this print?
 */
package lecture04;

public class Ex18_ArrayEquality {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(a == b);
    }
}

// Answer:
// false
// Two separate arrays with equal contents; == compares references.
