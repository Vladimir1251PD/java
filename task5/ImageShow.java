package src.ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ImageShow {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage myPicture = ImageIO.read(new File(args[0]));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JPanel jPanel = new JPanel();
        frame.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
        jPanel.add(picLabel);
        frame.add(jPanel);
        frame.setVisible(true);
    }
}
