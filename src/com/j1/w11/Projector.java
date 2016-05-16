package com.j1.w11;

public class Projector{
  DvdPlayer dvdPlayer;
  
  public Projector(String projector , DvdPlayer dvdPlayer){}
  public void on(){ System.out.println("dvd on"); }
  public void off(){ System.out.println("dvd off"); }
  public void wideScreenMode(){ System.out.println("wide screen mode on"); }
}