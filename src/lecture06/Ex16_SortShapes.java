/*
 * Lecture 6 – Sort Different Shapes Together (slides_006/main.typ:332)
 * Demo: Collections.sort() on an ArrayList<Shape> orders Circles, Rectangles, and Squares by area.
 */
package lecture06;

import java.util.ArrayList;
import java.util.Collections;

public class Ex16_SortShapes {

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
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(0.0, 0.0, 2.0));
        shapes.add(new Circle(0.0, 0.0, 1.0));
        shapes.add(new Rectangle(0.0, 0.0, 10.0, 5.0));
        shapes.add(new Square(0.0, 0.0, 0.5));
        Collections.sort(shapes);
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}

// Output:
// 0.25                 (Square)
// 3.141592653589793    (Circle, pi)
// 12.566370614359172   (Circle, 4 pi)
// 50.0                 (Rectangle)
