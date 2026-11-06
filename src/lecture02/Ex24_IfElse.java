/*
 * Lecture 2 – if-else Statement (slides_002/main.typ:549)
 * Demo: Exactly one branch runs.
 */
package lecture02;

public class Ex24_IfElse {

    public static void main(String[] args) {
        int a = 4, b = 8;
        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        System.out.println("maximum = " + maximum);
    }
}
