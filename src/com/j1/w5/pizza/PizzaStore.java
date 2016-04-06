package headfirst.factory;

public class PizzaStore{
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza=null;
    pizza=factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}