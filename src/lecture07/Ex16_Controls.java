/*
 * Lecture 7 – Match a Control to the Task (slides_007/main.typ:505)
 * Demo: Enter text, choose values, explain a control (tooltip), choose a file.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex16_Controls {
    public Ex16_Controls() {
        JFrame frame = new JFrame("Controls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2, 8, 8));

        // Enter text
        frame.add(new JLabel("JTextField"));
        frame.add(new JTextField("Name"));
        frame.add(new JLabel("JPasswordField"));
        frame.add(new JPasswordField("secret"));
        frame.add(new JLabel("JTextArea"));
        frame.add(new JScrollPane(new JTextArea("Line 1\nLine 2", 3, 15)));

        // Choose values
        frame.add(new JLabel("JCheckBox"));
        frame.add(new JCheckBox("Subscribe"));
        frame.add(new JLabel("JComboBox"));
        frame.add(new JComboBox<>(new String[]{"Red", "Green", "Blue"}));
        frame.add(new JLabel("JList"));
        frame.add(new JScrollPane(new JList<>(new String[]{"Java", "C", "Python"})));

        // Explain a control and choose a file
        JButton fileButton = new JButton("Open file...");
        fileButton.setToolTipText("Choose a file with JFileChooser");
        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    System.out.println("Selected: " + chooser.getSelectedFile());
                }
            }
        });
        frame.add(new JLabel("JFileChooser (hover for tooltip)"));
        frame.add(fileButton);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex16_Controls::new);
    }
}
