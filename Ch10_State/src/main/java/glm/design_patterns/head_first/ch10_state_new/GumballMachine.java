package glm.design_patterns.head_first.ch10_state_new;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuartersState;
    State soldState;
    State winnerState;//新增 获奖

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuartersState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState=new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        }

    }

    // public void dispense() {

    // }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    void releaseBall() {
        System.out.println("a gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuartersState() {
        return hasQuartersState;
    }

    public void setHasQuartersState(State hasQuartersState) {
        this.hasQuartersState = hasQuartersState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

}