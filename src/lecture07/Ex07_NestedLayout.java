/*
 * Lecture 7 – Combine Layouts with JPanel (slides_007/main.typ:216)
 * Question: Which components and layout managers produce this window?
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex07_NestedLayout {
    public Ex07_NestedLayout() {
        JFrame frame = new JFrame("Nested layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JButton("Right"));
        panel1.add(new JButton("top"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JButton("Left"));
        panel2.add(new JButton("bottom"));

        frame.setLayout(new GridLayout(2, 2));
        frame.add(new JLabel("Top left", JLabel.CENTER));
        frame.add(panel1);
        frame.add(panel2);
        frame.add(new JLabel("Bottom right", JLabel.CENTER));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex07_NestedLayout::new);
    }
}

// Answer:
// Frame: GridLayout(2, 2) with four cells.
//   top left:     JLabel "Top left"
//   top right:    JPanel with BoxLayout Y_AXIS -> buttons "Right", "top" stacked
//   bottom left:  JPanel with BoxLayout X_AXIS -> buttons "Left", "bottom" in a row
//   bottom right: JLabel "Bottom right"
