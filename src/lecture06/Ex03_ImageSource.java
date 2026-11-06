/*
 * Lecture 6 – Abstract Methods Declare a Contract / Calling Through an Abstract Type
 *             (slides_006/main.typ:72, 90)
 * Demo: ImageSource ref = new Camera(); Image image = ref.getNextImage();
 */
package lecture06;

public class Ex03_ImageSource {

    // Stand-in for a real image type.
    static class Image {
        private String description;

        public Image(String description) {
            this.description = description;
        }
        @Override
        public String toString() {
            return "Image[" + description + "]";
        }
    }

    public static abstract class ImageSource {
        String name;
        public abstract Image getNextImage();  // no body: a concrete subclass must supply it
    }

    public static class Camera extends ImageSource {
        private int frame = 0;

        @Override
        public Image getNextImage() {
            frame++;
            return new Image("camera frame " + frame);
        }
    }

    // COMPILE ERROR: Broken is not abstract and does not override abstract method getNextImage()
    // public static class Broken extends ImageSource { }

    public static void main(String[] args) {
        ImageSource ref = new Camera();
        Image image = ref.getNextImage();   // Camera.getNextImage() runs
        System.out.println(image);
        System.out.println(ref.getNextImage());
    }
}
