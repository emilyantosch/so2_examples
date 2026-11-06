/*
 * Lecture 6 – Sort a List of Vectors (slides_006/main.typ:282)
 * Demo: Collections.sort() uses compareTo(): ascending natural order, list changed in place.
 */
package lecture06;

import java.util.ArrayList;
import java.util.Collections;

public class Ex14_SortVectors {

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
        ArrayList<Vector2D> vectors = new ArrayList<>();
        vectors.add(new Vector2D(0, 5));
        vectors.add(new Vector2D(0, -1));
        vectors.add(new Vector2D(7, 8));
        vectors.add(new Vector2D(0, 0));
        Collections.sort(vectors);
        for (Vector2D vector : vectors) {
            System.out.println(vector.getAbs());
        }
    }
}

// Output:
// 0.0
// 1.0
// 5.0
// 10.63014581273465   (sqrt(113))
