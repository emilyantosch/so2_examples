/*
 * Lecture 7 – Alternative: Command Strings (slides_007/main.typ:434)
 * Demo: Identify the button by its action command instead of its source object.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex12_ActionCommand implements ActionListener {
    private JPanel panel;
    private JButton buttonRed, buttonBlue, buttonRandom;

    public Ex12_ActionCommand() {
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(4, 1));
        frame.add(buttonRed = new JButton("Change color to red"));
        frame.add(buttonBlue = new JButton("Change color to blue"));
        frame.add(buttonRandom = new JButton("Change to random color"));
        frame.add(panel = new JPanel());

        buttonRed.setActionCommand("red");
        buttonBlue.setActionCommand("blue");
        buttonRandom.setActionCommand("random");

        buttonRed.addActionListener(this);
        buttonBlue.addActionListener(this);
        buttonRandom.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        System.out.println("Action command: " + command);
        if ("red".equals(command)) {
            panel.setBackground(Color.RED);
        } else if ("blue".equals(command)) {
            panel.setBackground(Color.BLUE);
        } else if ("random".equals(command)) {
            java.util.Random random = new java.util.Random();
            panel.setBackground(new Color(random.nextFloat(),
                    random.nextFloat(), random.nextFloat()));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex12_ActionCommand::new);
    }
}
