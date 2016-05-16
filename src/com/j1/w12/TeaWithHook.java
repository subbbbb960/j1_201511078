package com.j1.w12;
import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook{
  public void brew(){
    System.out.println("Tea brew");
  }
  public void addCondiments(){
    System.out.println("Steep Tea Bag");
    System.out.println("Add Lemon");
  }
  public boolean customerWantsCondiments(){
    String answer;
    Scanner a=new Scanner(System.in);
    System.out.println("Add Condiments? (yes/no)");
    answer=a.nextLine();
    
    if(answer=="yes")
      return true;
    else
      return false;
  }
}