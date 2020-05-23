package glm.design_patterns.head_first.ch3_decorator_coffe;
//一种饮料
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description="Dark Roast Coffee";
    }
    public double cost() {
        return 0.79;
    }
}