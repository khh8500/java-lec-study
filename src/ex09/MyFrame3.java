package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
    public MyFrame3() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame3 f = new MyFrame3();
    }
}
