/*
 * Lecture 6 – Declare a Shared Capability / Implement the Contract (slides_006/main.typ:142, 153)
 * Demo: interface Scalable, class Vector2D implements Scalable.
 */
package lecture06;

public class Ex07_ScalableVector {

    public interface Scalable {
        void resize(double factor);
    }

    public static class Vector2D implements Scalable {
        private double x, y;
        public Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public void resize(double factor) {
            x *= factor;
            y *= factor;
        }
        public double getX() { return x; }
        public double getY() { return y; }
    }

    public static void main(String[] args) {
        Vector2D vector = new Vector2D(1, 3);
        vector.resize(2.0);
        System.out.println("(" + vector.getX() + ", " + vector.getY() + ")");
    }
}

// Output: (2.0, 6.0)
