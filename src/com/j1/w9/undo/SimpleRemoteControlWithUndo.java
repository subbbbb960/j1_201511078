package com.j1.w9.undo;

public class SimpleRemoteControlWithUndo {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public SimpleRemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    
    Command noCommand=new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot,Command onCommand,Command offCommand){
    onCommands[slot]=onCommand;
    offCommands[slot]=offCommand;
  }
  public void onButtonWasPushed(int slot){
    offCommands[slot].execute();
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
}