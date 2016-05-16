package com.j1.w11;

public class Amplifier{
  String description;
  Tuner tuner;
  DvdPlayer dvd;
  
  public void on(){ System.out.println("Amp on"); }
  public void off(){ System.out.println("Amp off"); }
  public void setDvd(DvdPlayer dvd){ System.out.println(""); }
  public void setTuner(Tuner tuner){ System.out.println(""); }
  public void setVolume(int volume){
    System.out.println("Volume is "+volume); 
  }
}