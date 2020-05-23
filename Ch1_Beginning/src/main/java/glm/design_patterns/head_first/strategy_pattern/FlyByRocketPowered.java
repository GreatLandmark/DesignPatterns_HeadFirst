package glm.design_patterns.head_first.strategy_pattern;

public class FlyByRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I fly with a rocket !");
    }
}