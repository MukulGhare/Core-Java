package Frames;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

    public static void main(String[] args) {
        // MyFrame frame = new MyFrame();

        ImageIcon pic = new ImageIcon("Images/pikachu.jpg");
        Border border = BorderFactory.createLineBorder(Color.WHITE,3);

        JLabel label = new JLabel();
        label.setText("Pikachu me tumhe Chunta hu >>"); // set text of label
        label.setIcon(pic);
        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT , CENTER , RIGHT of img
        label.setVerticalTextPosition(JLabel.TOP); // TOP , CENTER , BOTTOM of img
        label.setForeground(new Color(230, 118, 65));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(30);
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // required to display BG colour
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 300, 300);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();

        frame.setVisible(true);
    }

}
