package glm.design_patterns.head_first.ch3_decorator_coffe;
//一种饮料
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description="House Blend Coffee";
    }
    public double cost() {
        return 0.89;
    }
}