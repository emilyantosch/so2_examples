/*
 * Lecture 2 – Explicit Type Conversion (slides_002/main.typ:452, 464)
 * Question: What does each cast produce?
 */
package lecture02;

public class Ex18_CastResults {

    public static void main(String[] args) {
        double a = 128.38;
        int b = (int) a;
        byte c = (byte) a;
        System.out.println("double: " + a);
        System.out.println("int   : " + b);
        System.out.println("byte  : " + c);
    }
}

// Answer:
// double: 128.38
// int   : 128    (fraction discarded)
// byte  : -128   (128 does not fit in -128..127; the low 8 bits 10000000 are kept)
