package com.company;

import javax.swing.*;
import java.awt.*;

public class Sattelite {
    JFrame frame;
    JPanel space;
    public int x;
    public int y;
    public int speedX = 5;
    public int speedY = 5;

    public Sattelite(JFrame frame, JPanel space) {
        this.frame = frame;
        this.space = space;
        x = 0;
        y = 360;
    }
    public void draw(Graphics g) {
        g.fillOval(x, y, 15, 15);
    }

    public void moveBall  () {
        x+= speedX;
    }




    //bouncing test
    /*
    public void moveBall() {
        if (x > 1280) {
            speedX*= -1;
            x+= speedX;
        }
        else if (x < 0) {
            speedX*= -1;
            x+= speedX;
        }
        else if (y < 0) {
            speedY*= -1;
            y+= speedY;
        }
         else if (y > 720) {
            speedY*= -1;
            y+= speedY;
        } else {
             x += speedX;
             y += speedY;
        }

     */
}
