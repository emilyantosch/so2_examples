/*
 * Lecture 5 – Task: Sum the Areas (slides_005/main.typ:526)
 * Task: Add `getArea()` to the shape classes. Store one Circle, Rectangle, and Square
 *       in an `ArrayList<Shape>` and sum their areas.
 */
package lecture05;

import java.util.ArrayList;

public class Ex19_SumAreas {

    static class Shape {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        // Placeholder; lecture 6 replaces it with an abstract method.
        public double getArea() {
            return 0.0;
        }
    }

    static class Circle extends Shape {
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

    static class Rectangle extends Shape {
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

    static class Square extends Shape {
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
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0, 3.0, 1.0));
        shapes.add(new Rectangle(-1.0, 0.0, 3.5, 4.0));
        shapes.add(new Square(0.0, 0.0, 2.5));

        double sumArea = 0.0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        System.out.println("Overall area = " + sumArea);
    }
}

// Output: Overall area = 23.391592653589793  (pi + 14 + 6.25)
