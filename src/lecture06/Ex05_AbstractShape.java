/*
 * Lecture 6 – Task: Make Shape Abstract (slides_006/main.typ:102)
 * Task: Prevent plain Shape objects. Require each concrete shape to implement getArea().
 */
package lecture06;

import java.util.ArrayList;

public class Ex05_AbstractShape {

    public static abstract class Shape {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public abstract double getArea();
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
        // COMPILE ERROR: Shape is abstract; cannot be instantiated
        // Shape shape = new Shape(0.0, 0.0);
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
