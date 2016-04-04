package com.j1.w4;
 
abstract class Soldier {
  String description="bare Soldier";
  public String getDescription(){
    return description;
  }
  public abstract double cost();
}
 
class firstWeapon extends Soldier {
  public firstWeapon(){
    description="Soldier with AK47";
  }
  public double cost() {
    return 999.99;
  }
}
 
class secondWeapon extends Soldier {
  public secondWeapon(){
    description="Soldier with desert eagle";
  }
  public double cost() {
    return 499.99;
  }
}
 
abstract class CondimentDecorator extends Soldier {
  public abstract String getDescription();
}
 
class grenade extends CondimentDecorator{
  Soldier soldier;
  public grenade(Soldier b){
    soldier=b;
  }
  public String getDescription() {
    return soldier.getDescription()+", grenade";
  }
  public double cost() {
    return soldier.cost()+ 100.20;
  }
}
 
class armour extends CondimentDecorator{
  Soldier soldier;
  public armour(Soldier b) {
    soldier=b;
  }
  public String getDescription(){
    return soldier.getDescription()+", armour";
  }
  public double cost(){
    return soldier.cost()+ 500.10;
  }
}
 
public class FootSoldierMain{
  public static void main (String args[]){
    Soldier f=new firstWeapon();
    
    Soldier g=new grenade(f);
    Soldier agf=new armour(g);
    // Soldier wmd=new armour(new grenade(new firstWeapon));
    // It's you who is in my heart.
    
    System.out.println(agf.getDescription());
    System.out.println(agf.cost());
  }
}