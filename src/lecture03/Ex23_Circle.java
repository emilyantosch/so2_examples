/*
 * Lecture 3 – Task: Class Circle (slides_003/main.typ:675)
 * Task: Model a circle. Implement these four constructors.
 */
package lecture03;

public class Ex23_Circle {

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

        Circle(double radius) {
            this(0.0, 0.0, radius);
        }

        Circle(Circle circle) {
            this(circle.x, circle.y, circle.radius);
        }
    }

    static void print(String label, Circle c) {
        System.out.println(label + ": x=" + c.x + ", y=" + c.y + ", radius=" + c.radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(circle2);
        Circle circle4 = new Circle(-1.2, 7.1, 3.0);

        print("circle1", circle1);
        print("circle2", circle2);
        print("circle3", circle3);
        print("circle4", circle4);
        System.out.println("circle3 == circle2: " + (circle3 == circle2)); // copy is a new object
    }
}

// Output:
// circle1: x=0.0, y=0.0, radius=1.0
// circle2: x=0.0, y=0.0, radius=2.5
// circle3: x=0.0, y=0.0, radius=2.5
// circle4: x=-1.2, y=7.1, radius=3.0
// circle3 == circle2: false
