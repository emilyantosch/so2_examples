/*
 * Lecture 6 – Implement Multiple Interfaces (slides_006/main.typ:178, 187)
 * Demo: One superclass, any number of interfaces: GrayImage implements Scalable, Drawable, Rotateable.
 */
package lecture06;

public class Ex09_GrayImage {

    public interface Scalable {
        void resize(double factor);
    }

    public interface Drawable {
        void draw();
    }

    public interface Rotateable {
        void rotateLeft();
    }

    public static class GrayImage implements Scalable, Drawable, Rotateable {
        private int width, height;

        public GrayImage(int width, int height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public void resize(double factor) {
            width = (int) Math.round(width * factor);
            height = (int) Math.round(height * factor);
        }
        @Override
        public void draw() {
            System.out.println("Drawing gray image " + width + " x " + height);
        }
        @Override
        public void rotateLeft() {
            int oldWidth = width;
            width = height;
            height = oldWidth;
        }
    }

    public static void main(String[] args) {
        GrayImage image = new GrayImage(640, 480);
        image.draw();
        image.resize(0.5);
        image.draw();
        image.rotateLeft();
        image.draw();

        // The same object seen through each interface type
        Drawable drawable = image;
        Rotateable rotateable = image;
        rotateable.rotateLeft();
        drawable.draw();
    }
}
