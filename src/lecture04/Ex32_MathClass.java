/*
 * Lecture 4 – The `Math` Class (slides_004/main.typ:675, 679)
 * Demo: Trigonometric methods use radians.
 */
package lecture04;

public class Ex32_MathClass {

    public static void main(String[] args) {
        double angleDeg = 127.5;
        double angleRad = Math.toRadians(angleDeg);
        System.out.printf("cos(%.2f) = %.2f\n",
            angleRad, Math.cos(angleRad));

        // Other static members from the overview
        System.out.println(Math.pow(2, 10));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.max(3, 7) + " " + Math.abs(-4) + " " + Math.round(2.5));
        System.out.println(Math.PI + " " + Math.E);
        System.out.println(Math.random()); // in [0.0, 1.0)
    }
}

// Output (decimal separator depends on the default locale for printf):
// cos(2.23) = -0.61
// 1024.0
// 1.4142135623730951
// 7 4 3
// 3.141592653589793 2.718281828459045
// <random number>
