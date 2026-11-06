/*
 * Lecture 2 – Constants (slides_002/main.typ:178)
 * Demo: A final variable can be assigned only once.
 */
package lecture02;

public class Ex06_Constants {

    public static void main(String[] args) {
        final double PI = 3.1416;
        // COMPILE ERROR: cannot assign a value to final variable PI
        // PI = 3;
        System.out.println(PI);
    }
}
