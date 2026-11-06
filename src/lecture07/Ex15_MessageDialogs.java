/*
 * Lecture 7 – Choose a Message Type (slides_007/main.typ:485)
 * Demo: Each call waits until its dialog is dismissed.
 */
package lecture07;

import javax.swing.*;

public class Ex15_MessageDialogs {
    public Ex15_MessageDialogs() {
        JFrame frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(frame,
                "This is a plain message.", "Message",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(frame,
                "This is an information message.", "Message",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(frame,
                "This is a warning.", "Message",
                JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex15_MessageDialogs::new);
    }
}
