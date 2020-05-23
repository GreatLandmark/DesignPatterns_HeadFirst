package glm.design_patterns.head_first.ch12_compound_duck;

public class RedheadDuck implements Quackable {
    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck quack");
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