/*
 * Lecture 7 – Change the Arrangement (slides_007/main.typ:197)
 * Demo: Horizontal row / Equal-sized cells / Rows that wrap.
 * Opens one window per layout manager. Resize the FlowLayout window to see wrapping.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex06_ChangeArrangement {
    public Ex06_ChangeArrangement() {
        JFrame frame1 = createFrame("BoxLayout X_AXIS", 50);
        Container contentPane = frame1.getContentPane();
        contentPane.setLayout(
                new BoxLayout(contentPane, BoxLayout.X_AXIS));
        addButtonsAndShow(frame1);

        JFrame frame2 = createFrame("GridLayout(2, 2)", 400);
        frame2.getContentPane().setLayout(new GridLayout(2, 2));
        addButtonsAndShow(frame2);

        JFrame frame3 = createFrame("FlowLayout", 650);
        frame3.getContentPane().setLayout(new FlowLayout());
        addButtonsAndShow(frame3);
    }

    private static JFrame createFrame(String title, int x) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(x, 50);
        return frame;
    }

    private static void addButtonsAndShow(JFrame frame) {
        Container contentPane = frame.getContentPane();
        contentPane.add(new JButton("Ready"));
        contentPane.add(new JButton("Set"));
        contentPane.add(new JButton("Go"));
        contentPane.add(new JButton("Again"));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex06_ChangeArrangement::new);
    }
}
