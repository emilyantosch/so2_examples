/*
 * Lecture 6 – A Subclass Can Stay Abstract (slides_006/main.typ:97)
 * Demo: Still missing an implementation? The subclass must remain abstract.
 */
package lecture06;

import java.util.ArrayList;

public class Ex04_AbstractSubclass {

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
        public abstract Image getNextImage();
    }

    public static class Camera extends ImageSource {
        @Override
        public Image getNextImage() {
            return new Image("from camera");
        }
    }

    public static class Scanner extends ImageSource {
        @Override
        public Image getNextImage() {
            return new Image("from scanner");
        }
    }

    // Adds video-specific state but still does not implement getNextImage().
    public static abstract class VideoSource extends ImageSource {
        protected int frameRate = 25;
    }

    public static class VideoCamera extends VideoSource {
        @Override
        public Image getNextImage() {
            return new Image("live video frame at " + frameRate + " fps");
        }
    }

    public static class VideoFile extends VideoSource {
        @Override
        public Image getNextImage() {
            return new Image("video file frame at " + frameRate + " fps");
        }
    }

    public static void main(String[] args) {
        // COMPILE ERROR: VideoSource is abstract; cannot be instantiated
        // ImageSource invalid = new VideoSource();
        ArrayList<ImageSource> sources = new ArrayList<>();
        sources.add(new Camera());
        sources.add(new Scanner());
        sources.add(new VideoCamera());
        sources.add(new VideoFile());
        for (ImageSource source : sources) {
            System.out.println(source.getNextImage());
        }
    }
}
