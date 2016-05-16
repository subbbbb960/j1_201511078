package com.j1.w11;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
    Amplifier amp=new Amplifier();
    Tuner tuner=new Tuner("tuner",amp);
    DvdPlayer dvd=new DvdPlayer("dvd",amp);
    Projector projector=new Projector("projector",dvd);
    
    
    
    HomeTheaterFacade ht=new HomeTheaterFacade(amp,tuner,dvd,projector);
    String movie="The Bourne Identity";
    ht.watchMovie(movie);
    ht.endMovie();
  }
}