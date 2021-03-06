package com.j1.w7;
  
public class Singleton{
  // private static Singleton uniqueInstance;
  private static Singleton uniqueInstance=new Singleton();
  // ㄴ윗윗줄로안쓰고 윗줄로쓰는것 : 만드는 시점이 다르다(early)
  private static int numCalled=0; //계속 남아있게하기위해 static
  private Singleton() {}
  public static Singleton getInstance() { //없으면 만들고 있으면 있는걸 반환
    //if(uniqueInstance==null) {
    //  new Singleton(); 이렇게하면 반환할수없어 에러가남 (private)
    //  uniqueInstance=new Singleton();
    //}  early로 바꿨기때문에 주석처리 
    numCalled++;
    System.out.println("numCalled : "+numCalled);
    return uniqueInstance;
  }
}