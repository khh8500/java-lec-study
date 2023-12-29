package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame {
    public MyFrame1() {
        setSize(300, 200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
    }
}
