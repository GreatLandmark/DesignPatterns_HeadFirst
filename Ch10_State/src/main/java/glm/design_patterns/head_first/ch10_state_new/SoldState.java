package glm.design_patterns.head_first.ch10_state_new;

public class SoldState implements State {
    GumballMachine g;

    public SoldState(GumballMachine g) {
        this.g = g;
    }

    @Override
    public void dispense() {
        g.releaseBall();
        if (g.getCount() > 0) {
            g.setState(g.getNoQuarterState());
        } else {
            pr("oops, out of gumballs");
            g.setState(g.getSoldOutState());
        }
    }

    @Override
    public void ejectQuarter() {
        pr("sorry, you have already turned the crank");
    }

    @Override
    public void insertQuarter() {
        pr("please wait, we are already giving you a gumball");
    }

    @Override
    public void turnCrank() {
       pr("turning twice");
    }

}