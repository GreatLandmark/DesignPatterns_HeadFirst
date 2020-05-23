package glm.design_patterns.head_first.ch4_factory_simple;
// 注意，简单工厂不是“工厂模式”，是一种编程习惯。但是“工厂模式”可以从这里开始理解。
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("clam")){
            pizza=new ClamPizza();
        }
        else if(type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }
        else if(type.equals("veggie")){
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}