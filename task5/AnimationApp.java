package src.ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class AnimationApp {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 300));
        String imagePath = "C:\\Users\\Vlad\\Desktop\\JAVASD\\Homework\\src\\ru\\mirea\\task5\\rat-cool.gif";
        String imagePath2 = "C:\\Users\\Vlad\\Desktop\\JAVASD\\Homework\\src\\ru\\mirea\\task5\\rat-dancing-rat.gif";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));
        BufferedImage myPicture2 = ImageIO.read(new File(imagePath2));

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
        JPanel jPanel = new JPanel();

        frame.add(jPanel);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (random.nextBoolean()) {
                    jPanel.add(picLabel2);
                } else{
                    jPanel.add(picLabel);
                }
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        }, 0, 250);
        frame.setVisible(true);
        frame.pack();
    }
}