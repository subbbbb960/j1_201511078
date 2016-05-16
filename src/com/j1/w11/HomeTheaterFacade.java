package com.j1.w11;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  
  public HomeTheaterFacade(Amplifier amp,Tuner tuner,DvdPlayer dvd,Projector projector){
    this.amp=amp;
    this.tuner=tuner;
    this.dvd=dvd;
    this.projector=projector;
  }
  public void watchMovie(String movie){
    System.out.println("Get ready to watch a movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
    System.out.println("Movie name is "+movie);
    System.out.println("playing...");
  }
  public void endMovie(){
    System.out.println("The End...");
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
  
  
}