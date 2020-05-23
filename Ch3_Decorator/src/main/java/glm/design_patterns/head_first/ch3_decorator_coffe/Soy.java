package glm.design_patterns.head_first.ch3_decorator_coffe;

//一种咖啡
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+" , Soy ";
    }
    public double cost(){
        return 0.69+beverage.cost();
    }
}