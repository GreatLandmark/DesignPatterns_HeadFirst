package glm.design_patterns.head_first;

import org.junit.Test;

import glm.design_patterns.head_first.strategy_pattern.Duck;
import glm.design_patterns.head_first.strategy_pattern.FlyByRocketPowered;
import glm.design_patterns.head_first.strategy_pattern.MallardDuck;
import glm.design_patterns.head_first.strategy_pattern.ModelDuck;
import glm.design_patterns.head_first.strategy_pattern.Squeak;

public class StrategyPatternTest {
    @Test
    public void demo(){
        Duck mallardDuck=new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        Duck modelDuck=new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.setFlyBehavior(new FlyByRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}