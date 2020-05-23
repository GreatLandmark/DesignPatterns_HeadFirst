package glm.design_patterns.head_first.ch12_compound_duck;

public class DuckCall implements Quackable {
public DuckCall(){
    observable=new Observable(this);
}
    @Override
    public void quack() {
       System.out.println("DuckCall quack  Kwak ");
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