/*
 * Lecture 7 – BoxLayout: Stack Components (slides_007/main.typ:179)
 * Demo: `pack()` sizes the window from its components' preferred sizes.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex05_BoxLayout {
    public Ex05_BoxLayout() {
        JFrame frame = new JFrame("BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(
                new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JButton("Ready"));
        contentPane.add(new JButton("Set"));
        contentPane.add(new JButton("Go"));
        contentPane.add(new JButton("Again"));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex05_BoxLayout::new);
    }
}
