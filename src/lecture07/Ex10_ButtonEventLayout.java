/*
 * Lecture 7 – Build the Interface First (slides_007/main.typ:344)
 * Task: Create three buttons and a panel. Arrange them in four equal rows.
 * Clicking does nothing yet: no listeners are registered.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex10_ButtonEventLayout {
    private JPanel panel;
    private JButton buttonRed, buttonBlue, buttonRandom;

    public Ex10_ButtonEventLayout() {
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(4, 1));
        frame.add(buttonRed = new JButton("Change color to red"));
        frame.add(buttonBlue = new JButton("Change color to blue"));
        frame.add(buttonRandom = new JButton("Change to random color"));
        frame.add(panel = new JPanel());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex10_ButtonEventLayout::new);
    }
}
