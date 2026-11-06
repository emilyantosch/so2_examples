/*
 * Lecture 2 – while Loop (slides_002/main.typ:643)
 * Demo: Test before each iteration. The body may run zero times.
 */
package lecture02;

public class Ex29_WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        while (j < 5) {
            System.out.println("never printed");
        }
        System.out.println("j = " + j + ": body ran zero times");
    }
}
