/*
 * Lecture 5 – Task: Geometric Shapes (slides_005/main.typ:140)
 * Task: Model Circle, Rectangle, and Square with public fields. No methods yet.
 */
package lecture05;

public class Ex03_SeparateShapes {

    // Each class repeats x and y: this is the duplication the next task removes.
    static class Circle {
        public double x, y;
        public double radius;
    }

    static class Rectangle {
        public double x, y;
        public double width, height;
    }

    static class Square {
        public double x, y;
        public double width;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 2.0;
        circle.y = 3.0;
        circle.radius = 1.0;

        Rectangle rectangle = new Rectangle();
        rectangle.x = -1.0;
        rectangle.width = 3.5;
        rectangle.height = 4.0;

        Square square = new Square();
        square.width = 2.5;

        System.out.println("Circle at (" + circle.x + ", " + circle.y + "), radius " + circle.radius);
        System.out.println("Rectangle at (" + rectangle.x + ", " + rectangle.y + "), " + rectangle.width + " x " + rectangle.height);
        System.out.println("Square at (" + square.x + ", " + square.y + "), width " + square.width);
    }
}
