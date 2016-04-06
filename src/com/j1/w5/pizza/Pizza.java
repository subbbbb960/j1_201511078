package headfirst.factory;

abstract public class Pizza{
  String name;
  
  public String getName() {
    return name;
  }
  public void prepare() {
    System.out.println("preparing"+name);
  }
  public void bake(){
    System.out.println("baking"+name);
  }
  public void cut(){
    System.out.println("cutting"+name);
  }
  public void box(){
    System.out.println("boxing"+name);
  }
}