/*
 * Lecture 7 – More Events, More Listener Interfaces (slides_007/main.typ:474)
 * Demo: MouseListener, MouseMotionListener and KeyListener print their events.
 * KeyListener receives key events only while the component has focus.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex14_MoreListeners {
    public Ex14_MoreListeners() {
        JFrame frame = new JFrame("Click, drag and type here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setFocusable(true);

        // MouseAdapter implements the listener interfaces with empty methods.
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked at (" + e.getX() + ", " + e.getY() + ")");
                panel.requestFocusInWindow();
            }
        });
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Dragged to (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Typed '" + e.getKeyChar() + "'");
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        panel.requestFocusInWindow();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex14_MoreListeners::new);
    }
}
