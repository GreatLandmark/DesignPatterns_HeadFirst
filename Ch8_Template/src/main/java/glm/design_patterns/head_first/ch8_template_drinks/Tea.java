package glm.design_patterns.head_first.ch8_template_drinks;

public class Tea extends CoffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

}