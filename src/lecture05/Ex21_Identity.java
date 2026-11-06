/*
 * Lecture 5 – Identity: The == Operator (slides_005/main.typ:596)
 * Question: What does each comparison print?
 */
package lecture05;

public class Ex21_Identity {

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(1, 2);
        Point c = new Point(7, 3);
        Point d = a;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}

// Answer:
// false   (two different objects, even with equal fields)
// false
// true    (d refers to the same object as a)
// == compares references, not field values.
