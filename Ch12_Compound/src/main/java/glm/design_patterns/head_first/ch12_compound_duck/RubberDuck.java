package glm.design_patterns.head_first.ch12_compound_duck;

public class RubberDuck implements Quackable {
    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck Squack");
        notifyObserver();
    }

    Observable observable;

    @Override

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}