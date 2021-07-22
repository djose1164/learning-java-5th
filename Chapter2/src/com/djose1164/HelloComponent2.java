/*
  This package let to the user interact with the text using his mouse.
 */
package com.djose1164;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloComponent2 extends JComponent
        implements MouseMotionListener {
    String theMessage;
    // Coordinates for the message.
    int messageX = 125;
    int messageY = 95;

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
}
