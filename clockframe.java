public package DigitalClock;

import javax.swing.*;
import java.awt.*;

public class ClockFrame extends JFrame {
    private JLabel timeLabel;
    private JLabel dayLabel;
    private JLabel dateLabel;
    private TimeProvider timeProvider;

    public ClockFrame(TimeProvider provider) {
        this.timeProvider = provider;
        setupFrame();
        setupLabels();
        this.setVisible(true);
        updateClock();
    }

    private void setupFrame() {
        this.setTitle("Digital Clock");
        this.setSize(350, 200);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setLocation(700, 10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setupLabels() {
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
    }

    private void updateClock() {
        Thread t = new Thread(() -> {
            while (true) {
                timeLabel.setText(timeProvider.getCurrentTime());
                dayLabel.setText(timeProvider.getCurrentDay());
                dateLabel.setText(timeProvider.getCurrentDate());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
 Main {
    
}
