/*
 * Lecture 5 – Initializing Inherited Fields (slides_005/main.typ:198)
 * Demo: Private fields still exist in the object, but Circle cannot access them directly.
 */
package lecture05;

public class Ex06_ShapeSetters {

    static class Shape {
        private double x, y;

        public void setX(double x) {
            this.x = x;
        }
        public void setY(double y) {
            this.y = y;
        }
    }

    static class Circle extends Shape {
        public double radius;

        public Circle(double x, double y, double radius) {
            setX(x);
            setY(y);
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 3.0, 1.0);
        System.out.println("Circle radius " + circle.radius);
        // COMPILE ERROR: x has private access in Shape (no getter yet)
        // System.out.println(circle.x);
    }
}
