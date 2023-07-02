package com.company;

import java.awt.*;

public class Planet {

    public int x, y;
    public double Mass = 5.9722e24; //kg

    public Planet() {
        x = 640;
        y = 360;
    }
    public void draw(Graphics g) {
        g.fillOval(x, y, , 90);
    }
}
