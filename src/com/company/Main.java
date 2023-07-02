package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Orbital Simulation");
            Space space = new Space();
            //Screen sc = new Screen(frame, space);
            frame.setSize(1280, 720);
            frame.getContentPane().add(space);
            frame.setVisible(true);
            }
        );
    }
}
