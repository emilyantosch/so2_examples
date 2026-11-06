/*
 * Lecture 2 – do-while Loop (slides_002/main.typ:656)
 * Demo: Test after each iteration. The body runs at least once.
 */
package lecture02;

public class Ex30_DoWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        int j = 10;
        do {
            System.out.println("j = " + j + ": body ran once although j < 5 is false");
        } while (j < 5);
    }
}
