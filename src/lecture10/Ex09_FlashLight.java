/*
 * Lecture 10 – Task: Blink a Window (slides_010/main.typ:260, 272, 295, 318)
 * Task: Alternate the background between yellow and light gray about every 750 ms.
 * Never sleep on the EDT. Closing this demo window exits the application.
 */
package lecture10;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Ex09_FlashLight {
    // On the slide: class FlashLight (with main) in its own file
    static class FlashLight {
        private boolean isLightOn;
        private final JFrame frame = new JFrame("Flashing light");
        public FlashLight() {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 250);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            frame.setVisible(true);
        }
        public void switchLight() {
            isLightOn = !isLightOn;
            frame.getContentPane().setBackground(
                isLightOn ? Color.YELLOW : Color.LIGHT_GRAY);
        }
    }

    static class FlashThread extends Thread {
        private final FlashLight light;
        FlashThread(FlashLight light) { this.light = light; }
        public void run() {
            while (!isInterrupted()) {
                SwingUtilities.invokeLater(light::switchLight);
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlashLight light = new FlashLight();
            new FlashThread(light).start();
        });
    }
}
