package com.j1.w12;

public class BaristaWithHook{
  public static void main(String[] args){
    System.out.println("TeaWithHook----------------");
    TeaWithHook tea=new TeaWithHook();
    tea.prepareRecipe();
    System.out.println("CoffeeWithHook----------------");
    CoffeeWithHook coffee=new CoffeeWithHook();
    coffee.prepareRecipe();
  }
}