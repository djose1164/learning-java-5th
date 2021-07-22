package com.djose1164;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        var frame = new JFrame("Hello, Java!");
        //var label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(new HelloComponent());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
