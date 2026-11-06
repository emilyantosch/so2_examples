/*
 * Lecture 4 – foreach Loop (slides_004/main.typ:574)
 * Question: What will this print?
 */
package lecture04;

public class Ex27_Foreach {

    public static void main(String[] args) {
        int[] a = {7, 1, 3, 8};
        for (int element : a) {
            System.out.println("Element: " + element);
        }

        // The loop variable is a copy: this does not change the array.
        for (int element : a) {
            element = 0;
        }
        System.out.println(a[0]);
    }
}

// Answer:
// Element: 7
// Element: 1
// Element: 3
// Element: 8
// 7
