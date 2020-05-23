package glm.design_patterns.head_first.ch4_factory_simple;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore(new SimplePizzaFactory());
        var pizza=pizzaStore.orderPizza("clam");
        System.out.println(pizza.toString());
    }
}