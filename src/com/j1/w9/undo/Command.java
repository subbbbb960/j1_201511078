package com.j1.w9.undo;

public interface Command{
  public void execute();
  public void undo();
}