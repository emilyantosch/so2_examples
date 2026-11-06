/*
 * Lecture 6 – One Object, Two Reference Types (slides_006/main.typ:213, 220)
 * Question: Which calls compile?
 */
package lecture06;

public class Ex11_InterfaceReference {

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
        Vector2D classRef = new Vector2D(1, 3);
        Scalable interRef = classRef;

        classRef.resize(1.5);
        System.out.println(classRef.getX());
        interRef.resize(1.5);
        // System.out.println(interRef.getX());
        System.out.println(classRef.getX());
    }
}

// Answer: only interRef.getX() fails.
// COMPILE ERROR: cannot find symbol getX() in Scalable -- Scalable does not declare it.
// Both resize() calls change the same object: prints 1.5, then 2.25.
