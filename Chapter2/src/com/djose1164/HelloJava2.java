package com.djose1164;

import javax.swing.JFrame;

public class HelloJava2 {

    public static void main(String[] args) {
    var frame = new JFrame("HelloJava2");
    frame.add(new HelloComponent2(args[0]));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
    }
}
