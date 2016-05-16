package com.j1.w12;

public class Barista{
  public static void main(String[] args){
    System.out.println("Tea----------------");
    Tea tea=new Tea();
    tea.prepareRecipe();
    System.out.println("Coffee----------------");
    Coffee coffee=new Coffee();
    coffee.prepareRecipe();
  }
}