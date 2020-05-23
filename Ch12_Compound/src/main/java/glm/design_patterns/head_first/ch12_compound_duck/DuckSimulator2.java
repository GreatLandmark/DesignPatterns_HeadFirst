package glm.design_patterns.head_first.ch12_compound_duck;

public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 ds = new DuckSimulator2();
        ds.simulate();
    }
    void simulate(){
        Quackable mallardDuck=new QuackCounter( new MallardDuck());
        Quackable redheadDuck=new QuackCounter(  new RedheadDuck());
        Quackable duckCall=new QuackCounter( new DuckCall());
        Quackable rubberDuck=new QuackCounter(new RubberDuck());

        System.out.println("\n========= Duck Simulator with Decorator=========");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        Quackable gooseDuck=new QuackCounter(new GooseAdapter(new Goose()));
        simulate(gooseDuck);

        System.out.println("the duck quacked "+QuackCounter.getQuacks()+" times");
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}