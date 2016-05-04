package com.j1.w9.undo;

public class Client{
  public static void main(String[] args){
    SimpleRemoteControlWithUndo remote = new SimpleRemoteControlWithUndo();
    
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommnad(light);
    
    remote.setCommand(0,lightOn,lightOff);
    remote.onButtonWasPushed(0);
  }
}