package com.j1.w9.undo;

public class Light{
  int level;
  
  public void dim(int level){
    this.level=level;
    if (level==0){
      off();
    } else{
      System.out.println("Light is dimmed to "+level);
    }
  }
  public int getLevel(){
    return level;
  }
  public void on(){
    System.out.println("LIGHT ON");
  }
  public void off(){
    System.out.println("LIGHT OFF");
  }
}