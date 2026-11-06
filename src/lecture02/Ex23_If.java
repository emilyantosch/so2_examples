/*
 * Lecture 2 – if Statement (slides_002/main.typ:521)
 * Demo: Execute the body only when the boolean condition is true.
 */
package lecture02;

public class Ex23_If {

    public static void main(String[] args) {
        int a = 4, b = 8;
        int maximum = a;
        if (b > maximum) {
            maximum = b;
        }
        System.out.println("maximum = " + maximum);
    }
}
