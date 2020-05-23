package glm.design_patterns.head_first.strategy_pattern;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck .");
    }
}