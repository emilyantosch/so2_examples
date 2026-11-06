/*
 * Lecture 3 – Class Variables (slides_003/main.typ:816, 838)
 * Demo: `static` makes a field belong to the *class*, not to each object.
 */
package lecture03;

public class Ex26_StaticFields {

    static class Circle {
        double x, y, radius;
        static final double PI = 3.141592653589793;
        static int count;

        Circle() {
            radius = 1.0;
            count++;
        }

        double getArea() {
            return PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        System.out.println("Created: " + Circle.count);
    }
}

// Output:
// Created: 3
// The counter tracks creations, not live objects.
