/*
 * Lecture 5 – Value Equality: equals() / Exercise: Identity or Equality? (slides_005/main.typ:617, 623)
 * Question: a == b ? a.equals(b) ? Assume Point overrides equals() to compare x and y.
 */
package lecture05;

import java.util.Objects;

public class Ex22_IdentityOrEquality {

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Generated with IntelliJ: Code > Generate > equals() and hashCode()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Point a = new Point(10, 25);

        Point b = new Point(10, 2);
        System.out.println("Case 1: " + (a == b) + " " + a.equals(b));

        b = new Point(10, 25);
        System.out.println("Case 2: " + (a == b) + " " + a.equals(b));

        b = a;
        System.out.println("Case 3: " + (a == b) + " " + a.equals(b));

        // Equal objects must have equal hash codes
        System.out.println(new Point(10, 25).hashCode() == a.hashCode());
    }
}

// Answer:
// Case 1: false false   (different objects, different values)
// Case 2: false true    (different objects, same values)
// Case 3: true true     (same object)
// Without the equals() override, Object.equals() compares identity: case 2 would be false false.
