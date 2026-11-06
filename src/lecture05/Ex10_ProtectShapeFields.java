/*
 * Lecture 5 – Task: Protect the Shape Fields (slides_005/main.typ:314)
 * Task: Make all fields private. Add constructors and only the getters/setters you need.
 */
package lecture05;

public class Ex10_ProtectShapeFields {

    static class Shape {
        private double x, y;

        public Shape(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double x, double y, double radius) {
            super(x, y);
            this.radius = radius;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double x, double y, double width, double height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }
        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return height;
        }
    }

    static class Square extends Shape {
        private double width;

        public Square(double x, double y, double width) {
            super(x, y);
            this.width = width;
        }
        public double getWidth() {
            return width;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 3.0, 1.0);
        circle.setRadius(1.5);
        Rectangle rectangle = new Rectangle(-1.0, 0.0, 3.5, 4.0);
        Square square = new Square(0.0, 0.0, 2.5);

        System.out.println("Circle at (" + circle.getX() + ", " + circle.getY() + "), radius " + circle.getRadius());
        System.out.println("Rectangle " + rectangle.getWidth() + " x " + rectangle.getHeight());
        System.out.println("Square width " + square.getWidth());
    }
}
