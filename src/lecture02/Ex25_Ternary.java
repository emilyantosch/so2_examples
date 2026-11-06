/*
 * Lecture 2 – The ? Operator (slides_002/main.typ:564)
 * Demo: Select one of two values.
 */
package lecture02;

public class Ex25_Ternary {

    public static void main(String[] args) {
        int a = 4, b = 8;
        int maximum = (a > b) ? a : b;
        System.out.println("maximum = " + maximum);
    }
}
