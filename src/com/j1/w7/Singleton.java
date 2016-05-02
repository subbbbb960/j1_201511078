package com.j1.w7;
  
public class Singleton{
  // private static Singleton uniqueInstance;
  private static Singleton uniqueInstance=new Singleton();
  // �������ٷξȾ��� ���ٷξ��°� : ����� ������ �ٸ���(early)
  private static int numCalled=0; //��� �����ְ��ϱ����� static
  private Singleton() {}
  public static Singleton getInstance() { //������ ����� ������ �ִ°� ��ȯ
    //if(uniqueInstance==null) {
    //  new Singleton(); �̷����ϸ� ��ȯ�Ҽ����� �������� (private)
    //  uniqueInstance=new Singleton();
    //}  early�� �ٲ�⶧���� �ּ�ó�� 
    numCalled++;
    System.out.println("numCalled : "+numCalled);
    return uniqueInstance;
  }
}