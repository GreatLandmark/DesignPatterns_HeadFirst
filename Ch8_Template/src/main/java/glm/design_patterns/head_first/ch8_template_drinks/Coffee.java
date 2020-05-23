package glm.design_patterns.head_first.ch8_template_drinks;

public class Coffee extends CoffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

}