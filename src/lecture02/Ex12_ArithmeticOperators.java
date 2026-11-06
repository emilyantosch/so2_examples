/*
 * Lecture 2 – Arithmetic Operators (slides_002/main.typ:327)
 * Demo: Multiplication, division, and remainder bind before addition and subtraction.
 *       Parentheses override precedence. Integer division discards the fractional part.
 */
package lecture02;

public class Ex12_ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println(11 % 4);        // 3
        System.out.println(7 / 2);         // 3
        System.out.println(7 / 2.0);       // 3.5
        System.out.println(2 + 3 * 4);     // 14
        System.out.println((2 + 3) * 4);   // 20
        System.out.println(10 - 4 - 3);    // 3, left to right
    }
}
