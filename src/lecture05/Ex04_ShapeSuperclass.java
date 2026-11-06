/*
 * Lecture 5 – Task: Geometric Shapes (slides_005/main.typ:146)
 * Task: Move the common fields into a Shape superclass.
 */
package lecture05;

public class Ex04_ShapeSuperclass {

    static class Shape {
        public double x, y;
    }

    static class Circle extends Shape {
        public double radius;
    }

    static class Rectangle extends Shape {
        public double width, height;
    }

    static class Square extends Shape {
        public double width;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 2.0;      // inherited from Shape
        circle.y = 3.0;      // inherited from Shape
        circle.radius = 1.0; // declared in Circle

        Square square = new Square();
        square.width = 2.5;

        System.out.println("Circle at (" + circle.x + ", " + circle.y + "), radius " + circle.radius);
        System.out.println("Square at (" + square.x + ", " + square.y + "), width " + square.width);
    }
}
