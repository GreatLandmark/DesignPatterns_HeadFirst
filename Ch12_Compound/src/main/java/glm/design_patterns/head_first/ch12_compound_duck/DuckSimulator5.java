package glm.design_patterns.head_first.ch12_compound_duck;

public class DuckSimulator5 {
    public static void main(String[] args) {
        DuckSimulator5 ds = new DuckSimulator5();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        ds.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\n========= Duck Simulator with Observer =========");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        Flock flockOfMal = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        flockOfMal.add(mallardDuck1);
        flockOfMal.add(mallardDuck2);
        flockOfMal.add(mallardDuck3);
        flockOfMal.add(mallardDuck4);
        flockOfDucks.add(flockOfMal);
        System.out.println("\nDuck simulator: whole flock simulation");
        Quackologist quackologist=new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
       
        System.out.println("the duck quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}