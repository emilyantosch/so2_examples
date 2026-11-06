/*
 * Lecture 7 – Menus Are Components Too (slides_007/main.typ:119)
 * Task: Add File → Open, Save, Exit and Help → Help, About.
 */
package lecture07;

import javax.swing.*;

public class Ex03_MenuBar {
    public Ex03_MenuBar() {
        JFrame frame = new JFrame("Menu example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);
        menuFile.add(new JMenuItem("Open"));
        menuFile.add(new JMenuItem("Save"));
        menuFile.addSeparator();
        menuFile.add(new JMenuItem("Exit"));

        JMenu menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);
        menuHelp.add(new JMenuItem("Help"));
        menuHelp.add(new JMenuItem("About"));

        // Menu items need listeners before they perform an action.
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex03_MenuBar::new);
    }
}
