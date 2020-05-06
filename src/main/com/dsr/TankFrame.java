package com.dsr;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.dsr.Dire.*;

public class TankFrame extends Frame {
    Tank tank=new Tank(200,300,DOWN);
    public TankFrame(){
        setSize(400,500);
        setTitle("Tank");
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addKeyListener(new TankKeyListener());
    }
    @Override
    public void paint(Graphics g){
        tank.move(g);
    }
    class TankKeyListener extends KeyAdapter {
        boolean bu=false;
        boolean bd=false;
        boolean bl=false;
        boolean br=false;
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int keyCode=e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_UP:
                    bu=true;
                    break;
                case KeyEvent.VK_DOWN:
                    bd=true;
                    break;
                case KeyEvent.VK_LEFT:
                    bl=true;
                    break;
                case KeyEvent.VK_RIGHT:
                    br=true;
                    break;
                default:
                    break;
            }
            setDire();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            int keyCode=e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_UP:
                    bu=false;
                    break;
                case KeyEvent.VK_DOWN:
                    bd=false;
                    break;
                case KeyEvent.VK_LEFT:
                    bl=false;
                    break;
                case KeyEvent.VK_RIGHT:
                    br=false;
                    break;
                default:
                    break;
            }
        }
        public void setDire(){
            if(bu) tank.setDire(UP);
            if(bd) tank.setDire(DOWN);
            if(bl) tank.setDire(LEFT);
            if(br) tank.setDire(RIGHT);
            repaint();
        }
    }
}
