/*
 * Lecture 3 – Task: Class Circle (slides_003/main.typ:731)
 * Task: Add getters and setters. Reject negative radii in the setter.
 */
package lecture03;

public class Ex24_CircleGettersSetters {

    static class Circle {
        double x, y, radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        Circle() {
            this(0.0, 0.0, 1.0);
        }

        double getX() {
            return x;
        }

        void setX(double x) {
            this.x = x;
        }

        double getY() {
            return y;
        }

        void setY(double y) {
            this.y = y;
        }

        double getRadius() {
            return radius;
        }

        void setRadius(double radius) {
            if (radius >= 0.0) {
                this.radius = radius;
            }
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(2.0);
        circle.setY(-3.0);
        circle.setRadius(4.0);
        System.out.println(circle.getX() + ", " + circle.getY() + ", " + circle.getRadius());

        circle.setRadius(-5.0); // rejected
        System.out.println(circle.getRadius());

        Circle bad = new Circle(0.0, 0.0, -1.0); // constructors do not validate yet
        System.out.println(bad.getRadius());
    }
}

// Output:
// 2.0, -3.0, 4.0
// 4.0
// -1.0
