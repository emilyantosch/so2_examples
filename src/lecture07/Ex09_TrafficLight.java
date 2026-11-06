/*
 * Lecture 7 – Task: Draw a Traffic Light (slides_007/main.typ:332)
 * Task: Draw a traffic light with rectangles and circles. Choose one of the two states.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex09_TrafficLight {
    static class TrafficLightPanel extends JPanel {
        private final boolean green; // true: green light on, false: red light on

        TrafficLightPanel(boolean green) {
            this.green = green;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.DARK_GRAY);
            g.fillRect(70, 160, 10, 80);  // pole
            g.fillRect(40, 10, 70, 160);  // housing

            g.setColor(green ? Color.GRAY : Color.RED);
            g.fillOval(55, 20, 40, 40);
            g.setColor(Color.GRAY);
            g.fillOval(55, 70, 40, 40);
            g.setColor(green ? Color.GREEN : Color.GRAY);
            g.fillOval(55, 120, 40, 40);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(150, 250);
        }
    }

    public Ex09_TrafficLight() {
        JFrame frame = new JFrame("Traffic light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TrafficLightPanel(false));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex09_TrafficLight::new);
    }
}
