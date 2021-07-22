package com.djose1164;

import javax.swing.JComponent;
import java.awt.*;

public class HelloComponent extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java", 125, 95);
    }
}
