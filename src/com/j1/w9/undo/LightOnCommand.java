package com.j1.w9.undo;

public class LightOnCommand implements Command {
  Light light;
  int level;
  
  public LightOnCommand(Light light){
    this.light=light;
  }
  
  public void execute(){
    light.on();
  }
  
  public void undo(){
    light.dim(level);
  }
}