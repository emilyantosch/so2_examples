/*
 * Lecture 6 – Task: Compare Shapes by Area (slides_006/main.typ:305)
 * Task: Implement Comparable<Shape>. Order shapes by area. Where should compareTo() go?
 */
package lecture06;

public class Ex15_CompareShapes {

    // compareTo() goes into the abstract Shape: subclasses inherit it, each supplies getArea().
    public static abstract class Shape implements Comparable<Shape> {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public abstract double getArea();

        @Override
        public int compareTo(Shape other) {
            return Double.compare(getArea(), other.getArea());
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double x, double y, double radius) {
            super(x, y);
            this.radius = radius;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double x, double y, double width, double height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }
        @Override
        public double getArea() {
            return width * height;
        }
    }

    public static class Square extends Shape {
        private double width;

        public Square(double x, double y, double width) {
            super(x, y);
            this.width = width;
        }
        @Override
        public double getArea() {
            return width * width;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(0.0, 0.0, 1.0);        // pi
        Shape rectangle = new Rectangle(0.0, 0.0, 2.0, 2.0);  // 4
        Shape square = new Square(0.0, 0.0, 2.0);        // 4

        System.out.println("circle vs rectangle: " + circle.compareTo(rectangle));
        System.out.println("rectangle vs circle: " + rectangle.compareTo(circle));
        System.out.println("rectangle vs square: " + rectangle.compareTo(square));
    }
}

// Answer: in the abstract Shape. compareTo() is the same for all shapes; getArea()
// dispatches to each concrete shape's implementation.
// Output: -1, 1, 0
