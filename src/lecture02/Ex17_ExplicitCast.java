/*
 * Lecture 2 – Explicit Type Conversion (slides_002/main.typ:442)
 * Demo: A narrowing conversion needs an explicit cast. A cast can lose precision or change the value.
 */
package lecture02;

public class Ex17_ExplicitCast {

    public static void main(String[] args) {
        int a = 80;
        byte b = (byte) a;
        System.out.println(b);
        // COMPILE ERROR: incompatible types: possible lossy conversion from int to byte
        // byte noCast = a;
    }
}
