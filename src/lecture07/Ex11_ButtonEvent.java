/*
 * Lecture 7 – Swing's Observer Contract (slides_007/main.typ:381)
 * Task: Make ButtonEvent implement ActionListener. Register this object with all three buttons.
 * Also: Register the Listener (line 387), Respond to the Event Source (line 413).
 */
package lecture07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex11_ButtonEvent implements ActionListener {
    private JPanel panel;
    private JButton buttonRed, buttonBlue, buttonRandom;

    public Ex11_ButtonEvent() {
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(4, 1));
        frame.add(buttonRed = new JButton("Change color to red"));
        frame.add(buttonBlue = new JButton("Change color to blue"));
        frame.add(buttonRandom = new JButton("Change to random color"));
        frame.add(panel = new JPanel());

        buttonRed.addActionListener(this);
        buttonBlue.addActionListener(this);
        buttonRandom.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == buttonRed) {
            panel.setBackground(Color.RED);
        } else if (event.getSource() == buttonBlue) {
            panel.setBackground(Color.BLUE);
        } else if (event.getSource() == buttonRandom) {
            java.util.Random random = new java.util.Random();
            panel.setBackground(new Color(random.nextFloat(),
                    random.nextFloat(), random.nextFloat()));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex11_ButtonEvent::new);
    }
}
