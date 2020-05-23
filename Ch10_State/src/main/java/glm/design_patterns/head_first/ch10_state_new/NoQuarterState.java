package glm.design_patterns.head_first.ch10_state_new;

public class NoQuarterState implements State {
    GumballMachine g;

    public NoQuarterState(GumballMachine g) {
        this.g = g;
    }

    @Override
    public void insertQuarter() {
        print("you insert a quarter");
        g.setState(g.getHasQuartersState());
    }

    @Override
    public void ejectQuarter() {
       print("you have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        print("you turned, but there is no quarter");

    }

    @Override
    public void dispense() {
        print("you need to pay first");

    }

    static void print(String s) {
        System.out.println(s);
    }

}