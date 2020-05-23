package glm.design_patterns.head_first.ch3_decorator_coffe;

//一种咖啡
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+" , Whip ";
    }
    public double cost(){
        return 0.49+beverage.cost();
    }
}