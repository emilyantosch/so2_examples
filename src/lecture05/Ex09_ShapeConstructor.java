/*
 * Lecture 5 – Task: Initialize Superclass State (slides_005/main.typ:272)
 * Task: Add a Shape constructor for x and y. Call it from Circle instead of using setters.
 */
package lecture05;

public class Ex09_ShapeConstructor {

    static class Shape {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Circle extends Shape {
        public double radius;

        public Circle(double x, double y, double radius) {
            super(x, y);  // selects the matching constructor, not a default constructor
            this.radius = radius;
        }
    }

    // COMPILE ERROR: Shape has no no-arg constructor, so the implicit super() fails
    // static class BrokenCircle extends Shape {
    //     public BrokenCircle(double radius) { }
    // }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 3.0, 1.0);
        System.out.println("Circle radius " + circle.radius);
    }
}
