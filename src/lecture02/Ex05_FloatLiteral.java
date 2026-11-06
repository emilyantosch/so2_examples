/*
 * Lecture 2 – Literals (slides_002/main.typ:160, 169)
 * Question: Why does this fail to compile?
 *     float point = 3.1416;
 */
package lecture02;

public class Ex05_FloatLiteral {

    public static void main(String[] args) {
        // COMPILE ERROR: incompatible types: possible lossy conversion from double to float
        // float point = 3.1416;

        float point = 3.1416f;
        double precisePoint = 3.1416;
        System.out.println(point);
        System.out.println(precisePoint);
    }
}

// Answer: 3.1416 is a double literal. Java does not implicitly narrow it to float.
//         Use an f suffix, or choose a double variable.
