/*
 * Lecture 6 – Task: Transform Geometric Shapes (slides_006/main.typ:238)
 * Task: Define Transformable. Support moving, 90° left/right rotation, and scaling in every concrete shape.
 */
package lecture06;

import java.util.ArrayList;

public class Ex12_Transformable {

    public interface Transformable {
        void move(double dx, double dy);
        void rotateLeft();
        void rotateRight();
        void resize(double factor);
    }

    // Assumption: shapes rotate in place around their own position (x, y).
    public static abstract class Shape implements Transformable {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        // Same for every shape, so implemented once here.
        @Override
        public void move(double dx, double dy) {
            x += dx;
            y += dy;
        }
        public double getX() { return x; }
        public double getY() { return y; }
        public abstract double getArea();
        // rotateLeft(), rotateRight(), resize() stay abstract: Shape is abstract.
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double x, double y, double radius) {
            super(x, y);
            this.radius = radius;
        }
        @Override
        public void rotateLeft() { }   // a circle looks the same after rotation
        @Override
        public void rotateRight() { }
        @Override
        public void resize(double factor) {
            radius *= factor;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public String toString() {
            return String.format("Circle at (%.1f, %.1f), radius %.1f", getX(), getY(), radius);
        }
    }

    public static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double x, double y, double width, double height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }
        // A 90° turn swaps width and height.
        @Override
        public void rotateLeft() {
            double oldWidth = width;
            width = height;
            height = oldWidth;
        }
        @Override
        public void rotateRight() {
            rotateLeft();
        }
        @Override
        public void resize(double factor) {
            width *= factor;
            height *= factor;
        }
        @Override
        public double getArea() {
            return width * height;
        }
        @Override
        public String toString() {
            return String.format("Rectangle at (%.1f, %.1f), %.1f x %.1f", getX(), getY(), width, height);
        }
    }

    public static class Square extends Shape {
        private double width;

        public Square(double x, double y, double width) {
            super(x, y);
            this.width = width;
        }
        @Override
        public void rotateLeft() { }   // a square looks the same after a 90° turn
        @Override
        public void rotateRight() { }
        @Override
        public void resize(double factor) {
            width *= factor;
        }
        @Override
        public double getArea() {
            return width * width;
        }
        @Override
        public String toString() {
            return String.format("Square at (%.1f, %.1f), width %.1f", getX(), getY(), width);
        }
    }

    public static void main(String[] args) {
        ArrayList<Transformable> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0, 3.0, 1.0));
        shapes.add(new Rectangle(-1.0, 0.0, 3.5, 4.0));
        shapes.add(new Square(0.0, 0.0, 2.5));

        for (Transformable shape : shapes) {
            System.out.println("Before: " + shape);
            shape.move(1.0, -1.0);
            shape.rotateLeft();
            shape.resize(2.0);
            System.out.println("After:  " + shape);
        }
    }
}
