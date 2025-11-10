public package DigitalClock;

import javax.swing.SwingUtilities;

public class DigitalClock {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TimeProvider provider = new TimeProvider();
            new ClockFrame(provider);
        });
    }
}
 Main {
    
}
