/*
 * Lecture 3 – Class Methods (slides_003/main.typ:860)
 * Demo: Both `getPi` and `main` are class methods.
 */
package lecture03;

public class Ex27_StaticMethods {

    static class Circle {
        double radius;

        static double getPi() {
            // COMPILE ERROR: non-static variable radius cannot be referenced from a static context
            // System.out.println(radius);
            return 3.141592653589793;
        }
    }

    public static void main(String[] args) {
        System.out.println("Pi: " + Circle.getPi()); // no object needed
    }
}

// Output:
// Pi: 3.141592653589793
