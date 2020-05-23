package glm.design_patterns.head_first.ch10_state_new;

public class SoldOutState implements State {
    GumballMachine g;

    public SoldOutState(GumballMachine g) {
        this.g = g;
    }

    @Override
    public void dispense() {
        pr("no gumball dispense");
    }

    @Override
    public void ejectQuarter() {
        pr("you can not eject , you have not insert");
    }

    @Override
    public void insertQuarter() {
       pr("you can not insert a quarter, sold out");
    }

    @Override
    public void turnCrank() {
        pr("you turned, but there are no gumballs");
    }

}