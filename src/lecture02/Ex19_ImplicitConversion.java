/*
 * Lecture 2 – Implicit Type Conversion (slides_002/main.typ:470)
 * Demo: Widening conversions need no cast.
 */
package lecture02;

public class Ex19_ImplicitConversion {

    public static void main(String[] args) {
        short a = 71;
        int b = (int) a; // Cast is allowed, but redundant
        int c = a;
        System.out.println(b + " " + c);
    }
}
