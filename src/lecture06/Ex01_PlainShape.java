/*
 * Lecture 6 – What Is a Plain Shape? (slides_006/main.typ:42)
 * Question: Should we create a Shape object? What would its area be?
 */
package lecture06;

public class Ex01_PlainShape {

    // Shape as at the end of lecture 5: concrete, with a placeholder getArea().
    static class Shape {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getArea() {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape(0.0, 0.0);   // compiles, but what is this?
        System.out.println("Area of a plain Shape: " + shape.getArea());
    }
}

// Answer: No. A plain Shape has no meaningful geometry, so 0.0 is a made-up value.
// Making Shape abstract (with an abstract getArea()) forbids `new Shape(...)` and forces
// every concrete shape to provide a real area.
