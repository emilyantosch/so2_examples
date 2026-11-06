/*
 * Lecture 3 – Class Variables (slides_003/main.typ:768, 788)
 * Question: Does `PI` exist only once in memory? Does `count` count all objects created?
 */
package lecture03;

public class Ex25_InstanceFields {

    static class Circle {
        double x, y, radius;
        final double PI = 3.141592653589793;
        int count;

        Circle() {
            radius = 1.0;
            count++;
        }

        double getArea() {
            return PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        System.out.println(circle1.count);
        System.out.println(circle2.count);
        System.out.println(circle3.count);
        System.out.println(circle1.getArea());
    }
}

// Answer:
// 1
// 1
// 1
// 3.141592653589793
// No: every Circle object has its own PI copy (final only forbids reassignment)
// and its own count, which goes from 0 to 1. Fix: make them static (next example).
