package glm.design_patterns.head_first.strategy_pattern;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("~ ~ ~ Mute Quack ! << Slience >>");
    }

}