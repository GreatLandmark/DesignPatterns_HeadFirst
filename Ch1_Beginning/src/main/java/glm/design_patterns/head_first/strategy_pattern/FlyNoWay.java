package glm.design_patterns.head_first.strategy_pattern;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly ! ");
    }
}