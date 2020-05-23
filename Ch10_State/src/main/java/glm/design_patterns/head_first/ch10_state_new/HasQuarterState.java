package glm.design_patterns.head_first.ch10_state_new;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());// 用于 选一位获奖者的 随机数
    GumballMachine g;

    public HasQuarterState(GumballMachine g) {
        this.g = g;
    }

    @Override
    public void dispense() {
        pr("no gumball dispense");
    }

    @Override
    public void ejectQuarter() {
        pr("quarter returned");
        g.setState(g.getNoQuarterState());
    }

    @Override
    public void insertQuarter() {
        pr("you can not insert another quarter");
    }

    @Override
    public void turnCrank() {
        pr("you turned crank ...");
        int winner = randomWinner.nextInt(10);// 决定 这位顾客是否 获奖
        if ((winner == 0) && (g.getCount() > 1)) {
            g.setState(g.getWinnerState());
        } else {
            g.setState(g.getSoldState());
        }
    }

}