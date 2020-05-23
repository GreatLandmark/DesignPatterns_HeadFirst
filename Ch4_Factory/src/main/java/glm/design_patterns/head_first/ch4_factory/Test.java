package glm.design_patterns.head_first.ch4_factory;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new NYPizzaStore();

        Pizza pizza=pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}