/*
 * Lecture 5 – Initializing Inherited Fields (slides_005/main.typ:172, 190)
 * Task: Add a Circle constructor that sets x, y, and radius.
 * Question: What breaks if Shape makes x and y private?
 */
package lecture05;

public class Ex05_CircleConstructor {

    static class Shape {
        public double x, y;
    }

    static class Circle extends Shape {
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }

    // Same classes, but Shape makes x and y private.
    static class PrivateShape {
        private double x, y;
    }

    static class PrivateCircle extends PrivateShape {
        public double radius;

        public PrivateCircle(double x, double y, double radius) {
            // COMPILE ERROR: x has private access in PrivateShape
            // this.x = x;
            // COMPILE ERROR: y has private access in PrivateShape
            // this.y = y;
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 3.0, 1.0);
        System.out.println("Circle at (" + circle.x + ", " + circle.y + "), radius " + circle.radius);
    }
}

// Answer: this.x = x and this.y = y no longer compile in Circle: private fields are only
// accessible inside Shape. The fields still exist in every Circle object, but Circle must use
// accessible methods (setters) or a Shape constructor to initialize them.
