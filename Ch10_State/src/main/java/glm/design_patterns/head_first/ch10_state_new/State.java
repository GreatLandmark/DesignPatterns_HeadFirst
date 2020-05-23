package glm.design_patterns.head_first.ch10_state_new;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    default void pr(String s) {
        System.out.println(s);
    }
}