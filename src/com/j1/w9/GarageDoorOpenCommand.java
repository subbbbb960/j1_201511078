package com.j1.w9;

public class GarageDoorOpenCommand implements Command{
  GarageDoor door;
  
  public GarageDoorOpenCommand(GarageDoor door){
    this.door=door;
  }
  public void execute(){
    door.up();
  }
}