/*
 * Lecture 6 – Defer Implementation to Subclasses (slides_006/main.typ:173)
 * Demo: abstract Vector implements Scalable without resize(); Vector2D and Vector3D implement it.
 */
package lecture06;

import java.util.ArrayList;

public class Ex08_AbstractVector {

    public interface Scalable {
        void resize(double factor);
    }

    // Abstract: may leave resize() unimplemented.
    public static abstract class Vector implements Scalable {
    }

    public static class Vector2D extends Vector {
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
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Vector3D extends Vector {
        private double x, y, z;
        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public void resize(double factor) {
            x *= factor;
            y *= factor;
            z *= factor;
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }

    public static void main(String[] args) {
        ArrayList<Scalable> items = new ArrayList<>();
        items.add(new Vector2D(1, 3));
        items.add(new Vector3D(1, 2, 3));
        for (Scalable item : items) {
            item.resize(10);
            System.out.println(item);
        }
    }
}
