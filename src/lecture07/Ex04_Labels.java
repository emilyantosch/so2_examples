/*
 * Lecture 7 – JLabel: Text, Images and Borders (slides_007/main.typ:147)
 * Task: Recreate this window with two non-editable labels. Supply your own `icon.png`.
 */
package lecture07;

import javax.swing.*;
import java.awt.*;

public class Ex04_Labels {
    public Ex04_Labels() {
        JFrame frame = new JFrame("Label example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 1));
        // icon.png is resolved relative to the working directory (project root in IntelliJ).
        ImageIcon image = new ImageIcon("icon.png");
        Icon icon = image.getIconWidth() > 0 ? image : UIManager.getIcon("OptionPane.informationIcon");
        JLabel label1 = new JLabel("Icon", icon, JLabel.CENTER);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        JLabel label2 = new JLabel("Right-aligned text");
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setBorder(BorderFactory.createEtchedBorder(
                Color.RED, Color.ORANGE));
        frame.add(label1);
        frame.add(label2);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex04_Labels::new);
    }
}
