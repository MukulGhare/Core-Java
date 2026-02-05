package Frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("BroCode!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon img = new ImageIcon("pikachu.jpg");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(123, 69, 234));
    }

}
