package com.j1.w11;

public class DvdPlayer{
  Amplifier amplifier;
  String movie;
  
  public DvdPlayer(String dvd, Amplifier amplifier){}
  public void on(){ System.out.println("dvdPlayer on"); }
  public void off(){ System.out.println("dvdPlayer off"); }
  public void play(String movie){
    System.out.println("play "+movie); 
  }
  public void stop(){ System.out.println("dvdPlayer stop"); }
  public void eject(){ System.out.println("dvdPlayer eject"); }
}