package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener () {
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        switch(keyCode){
          case KeyEvent.VK_UP:
            setStatusText("forward 20");
            forward(20);
            break;
          case KeyEvent.VK_DOWN:
            setStatusText("back 20");
            back(20);
            break;
          case KeyEvent.VK_LEFT:
            setStatusText("left 20");
            left(90);
            forward(20);
            break;
          case KeyEvent.VK_RIGHT:
            setStatusText("right 20");
            right(90);
            forward(20);
            break;
          case KeyEvent.VK_Q:
            setStatusText("q pressed and exiting");
            break;
        }
      }
    } );
  }
}

class TurtleMouseListener extends Turtle{
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter() {
      int x;
      int y;
      public void mousePressed(MouseEvent e){
        x=e.getX();
        y=e.getY();
        System.out.println("x pos is : "+x);
        System.out.println("y pos is : "+y);
        
        if(x<200 && y<200) {
          left(90);
          forward(200-x);
          right(90);
          forward(200-y);
        }
        else if(x>200 && y<200){
          right(90);
          forward(x-200);
          left(90);
          forward(200-y);
        }
        else if(x<200 && y>200){
          left(90);
          forward(200-x);
          left(90);
          forward(y-200);
        }
        else if(x>200 && y>200){
          right(90);
          forward(x-200);
          right(90);
          forward(y-200);
        }
      }
    });
  }
}

public class TurtleKeyAndMouseMain {
  public static void main(String[] args){
    TurtleMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("hi");
    
  }
}