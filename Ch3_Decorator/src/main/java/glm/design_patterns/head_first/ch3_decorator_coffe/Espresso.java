package glm.design_patterns.head_first.ch3_decorator_coffe;
//一种饮料
public class Espresso extends Beverage{
    public Espresso() {
        description="Espresso";
    }
    public double cost() {
        return 1.99;
    }
}