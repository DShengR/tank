package com.dsr;

import java.awt.*;

import static com.dsr.Dire.UP;

public class Tank {
    private int x,y;
    private Dire dire= UP;
    private static final int SPEED=10;

    public Tank(int x, int y, Dire dire) {
        this.x = x;
        this.y = y;
        this.dire = dire;
    }

    public Dire getDire() {
        return dire;
    }

    public void setDire(Dire dire) {
        this.dire = dire;
    }

    public void move(Graphics g){
        switch (dire){
            case UP:
                y-=SPEED;
                break;
            case DOWN:
                y+=SPEED;
                break;
            case LEFT:
                x-=SPEED;
                break;
            case RIGHT:
                x+=SPEED;
                break;
            default:
                break;
        }
        g.fillRect(x,y,30,30);
    }
}
