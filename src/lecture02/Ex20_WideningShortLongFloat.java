/*
 * Lecture 2 – Implicit Type Conversion (slides_002/main.typ:479)
 * Question: Which lines compile?
 */
package lecture02;

public class Ex20_WideningShortLongFloat {

    public static void main(String[] args) {
        short a = 1024;
        long b = a;
        float c = b;
        System.out.println(a + " " + b + " " + c);
    }
}

// Answer: All three. 1024 is a constant that fits in short; short -> long and long -> float
//         are widening conversions (long -> float can lose precision, see Ex22).
