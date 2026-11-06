/*
 * Lecture 7 – Override paintComponent() (slides_007/main.typ:266)
 * Demo: Drawing Commands Use Pixel Coordinates (line 288), Give the Drawing a Preferred Size (line 308).
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex08_PaintPanel {
    static class MyPaintPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawRect(25, 50, 100, 30);
            g.drawString("JPanel", 55, 70);
            g.drawRect(25, 120, 100, 30);
            g.drawString("MyPaintPanel", 40, 140);
            g.drawLine(75, 80, 75, 120);
            g.fillPolygon(new int[]{70, 75, 80},
                          new int[]{90, 80, 90}, 3);
            g.setColor(Color.RED);
            g.fillRect(202, 70, 12, 42);
            g.fillOval(200, 120, 16, 16);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 200);
        }
    }

    public Ex08_PaintPanel() {
        JFrame frame = new JFrame("Paint example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyPaintPanel());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex08_PaintPanel::new);
    }
}
