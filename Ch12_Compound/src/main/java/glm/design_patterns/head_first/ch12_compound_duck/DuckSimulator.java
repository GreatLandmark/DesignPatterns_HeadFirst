package glm.design_patterns.head_first.ch12_compound_duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator ds=new DuckSimulator();
        ds.simulate();
    }
    void simulate(){
        Quackable mallardDuck= new MallardDuck();
        Quackable redheadDuck=new RedheadDuck();
        Quackable duckCall=new DuckCall();
        Quackable rubberDuck=new RubberDuck();

        System.out.println("\n========= Duck Simulator =========");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        Quackable gooseDuck=new GooseAdapter(new Goose());
        simulate(gooseDuck);
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}