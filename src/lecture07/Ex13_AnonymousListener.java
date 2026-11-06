/*
 * Lecture 7 – Alternative: One Listener per Button (slides_007/main.typ:457)
 * Demo: Anonymous class inside the constructor. No source check needed.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// The class no longer implements ActionListener.
public class Ex13_AnonymousListener {
    private JPanel panel;
    private JButton buttonRed, buttonBlue, buttonRandom;

    public Ex13_AnonymousListener() {
        JFrame frame = new JFrame("Button example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(4, 1));
        frame.add(buttonRed = new JButton("Change color to red"));
        frame.add(buttonBlue = new JButton("Change color to blue"));
        frame.add(buttonRandom = new JButton("Change to random color"));
        frame.add(panel = new JPanel());

        buttonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.RED);
            }
        });
        buttonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.BLUE);
            }
        });
        buttonRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                java.util.Random random = new java.util.Random();
                panel.setBackground(new Color(random.nextFloat(),
                        random.nextFloat(), random.nextFloat()));
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex13_AnonymousListener::new);
    }
}
