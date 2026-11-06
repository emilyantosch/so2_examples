/*
 * Lecture 2 – Implicit Type Conversion (slides_002/main.typ:497)
 * Demo: int -> float and long -> float / double can lose precision.
 */
package lecture02;

public class Ex22_WideningPrecisionLoss {

    public static void main(String[] args) {
        int big = 123456789;
        float f = big;              // no cast needed ...
        System.out.println(big);
        System.out.println((int) f);  // ... but the value changed

        long huge = 9007199254740993L;  // 2^53 + 1
        double d = huge;
        System.out.println(huge);
        System.out.println((long) d);
    }
}
