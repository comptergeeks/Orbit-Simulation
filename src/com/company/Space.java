package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Space extends JPanel {
    JFrame frame;
    Sattelite sat;
    Planet earth;
    public Space() {
        sat = new Sattelite(frame, this);
        earth = new Planet();
        JLabel pos = new JLabel();
        pos.setLocation(200, 200);
        setBackground(Color.BLACK);
        setSize(1280, 720);
        pos.setForeground(Color.white);
        pos.setVisible(true);
        add(pos);


        Timer timer = new Timer(16, new ActionListener() { //swing timer for drawing the ball and movements
            @Override
            public void actionPerformed(ActionEvent e) {
                sat.moveBall();
                pos.setText("(" + String.valueOf(sat.x) + ", " + String.valueOf(sat.y) + ")");
                repaint();
            }
        });
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        sat.draw(g);
        g.setColor(Color.BLUE);
        earth.draw(g);
    }
};

