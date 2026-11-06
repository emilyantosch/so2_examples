/*
 * Lecture 7 – A Minimal Window (slides_007/main.typ:77)
 * Demo: Use the same EDT startup pattern for the later GUI classes.
 */
package lecture07;

import javax.swing.*;

public class Ex01_HelloWorld {
    public Ex01_HelloWorld() {
        JFrame frame = new JFrame("GUI example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex01_HelloWorld::new);
    }
}
