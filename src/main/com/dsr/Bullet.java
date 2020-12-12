package com.dsr;

import java.awt.*;

/**
 * Created by duansr on 2020/5/7.
 */
public class Bullet {
    private int x,y;
    private Dire dire;
    private int width=10,height=10;
    private static final int SPEED=10;

    public Bullet(int x, int y,Dire dire) {
        this.x = x;
        this.y = y;
        this.dire=dire;
    }
    public void paint(Graphics g){
        Color c=g.getColor();
        g.setColor(Color.RED);
        move();
        g.fillOval(x,y,width,height);
        g.setColor(c);
    }
    public void move(){
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
    }
    public void toStrigzm(){
        System.out.println("zm.toString()");
    }
    public String toString(){
        return "zm add";
    }

}
