/*
 * Lecture 6 – Compare Vectors by Magnitude (slides_006/main.typ:260, 265)
 * Demo: Vector2D implements Scalable, Comparable<Vector2D>; read the sign, not the exact value.
 */
package lecture06;

public class Ex13_CompareVectors {

    public interface Scalable {
        void resize(double factor);
    }

    public static class Vector2D implements Scalable, Comparable<Vector2D> {
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
        public double getAbs() {
            return Math.sqrt(x * x + y * y);
        }
        @Override
        public int compareTo(Vector2D other) {
            return Double.compare(getAbs(), other.getAbs());
        }
    }

    public static void main(String[] args) {
        Vector2D a = new Vector2D(0, 5);
        Vector2D b = new Vector2D(3, 4);
        Vector2D c = new Vector2D(7, 8);

        System.out.println("a.compareTo(c) = " + a.compareTo(c));  // < 0: a comes before c
        System.out.println("c.compareTo(a) = " + c.compareTo(a));  // > 0: c comes after a
        System.out.println("a.compareTo(b) = " + a.compareTo(b));  // 0: same position
        System.out.println("a == b: " + (a == b));                 // 0 does not mean identity
    }
}
