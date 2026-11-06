/*
 * Lecture 7 – Size and Position (slides_007/main.typ:96)
 * Question: What happens without EXIT_ON_CLOSE? Why call setVisible(true)?
 * Task: Make the frame 400 × 300 pixels. Place its top-left corner at (50, 50).
 */
package lecture07;

import javax.swing.*;

public class Ex02_SizeAndPosition {
    public Ex02_SizeAndPosition() {
        JFrame frame = new JFrame("GUI example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // comment out to try the question
        frame.setSize(400, 300);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex02_SizeAndPosition::new);
    }
}

// Answer:
// Without EXIT_ON_CLOSE the default HIDE_ON_CLOSE only hides the window;
// the program keeps running (stop button stays red in IntelliJ).
// A new JFrame is initially hidden, so setVisible(true) is needed to show it.
