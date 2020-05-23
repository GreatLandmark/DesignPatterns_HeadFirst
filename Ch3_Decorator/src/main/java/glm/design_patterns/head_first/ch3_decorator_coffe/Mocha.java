package glm.design_patterns.head_first.ch3_decorator_coffe;

//一种咖啡
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+" , Mocha ";
    }
    public double cost(){
        return 0.29+beverage.cost();
    }
}