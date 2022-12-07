package src.ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadrid {
    static int MilanCounter = 0;
    static int MadridCounter = 0;
    static String LastScorer = "N/A";
    static String Winner = "DRAW";

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Milan vs. Madrid");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        JPanel labelPanel = new JPanel();
        labelPanel.setPreferredSize(new Dimension(300, 150));
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));

        JLabel resLabel = new JLabel("Result: " + MilanCounter + " X " + MadridCounter, JLabel.CENTER);
        JLabel lastScorer = new JLabel("Last Scorer: " + LastScorer, JLabel.CENTER);
        JLabel winner = new JLabel("Winner: " + Winner, JLabel.CENTER);
        JButton button1 = new JButton("AC Milan");
        button1.setPreferredSize(new Dimension(120, 30));
        JButton button2 = new JButton("Real Madrid");
        button2.setPreferredSize(new Dimension(120, 30));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MilanCounter++;
                resLabel.setText("Result: " + MilanCounter + " X " + MadridCounter);
                LastScorer = "AC Milan";
                lastScorer.setText("Last Scorer: " + LastScorer);
                if (MilanCounter > MadridCounter) {
                    Winner = "AC Milan";
                    winner.setText("Winner: " + Winner);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridCounter++;
                resLabel.setText("Result: " + MilanCounter + " X " + MadridCounter);
                LastScorer = "Real Madrid";
                lastScorer.setText("Last Scorer: " + LastScorer);
                if (MadridCounter > MilanCounter)
                {
                    Winner = "Real Madrid";
                    winner.setText("Winner: " + Winner);
                }
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(labelPanel);
        labelPanel.add(resLabel);
        labelPanel.add(lastScorer);
        labelPanel.add(winner);
        mainFrame.getContentPane().add(panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}

