package glm.design_patterns.head_first.ch12_compound_duck;

public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 ds = new DuckSimulator3();
        AbstractDuckFactory duckFactory=new CountingDuckFactory();
        ds.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck=duckFactory.createMallardDuck();
        Quackable redheadDuck=duckFactory.createRedheadDuck();
        Quackable duckCall=duckFactory.createDuckCall();
        Quackable rubberDuck=duckFactory.createRubberDuck();

        System.out.println("\n========= Duck Simulator with AbstractDuckFactory =========");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        Quackable gooseDuck=new GooseAdapter(new Goose());
        simulate(gooseDuck);

        System.out.println("the duck quacked "+QuackCounter.getQuacks()+" times");
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}