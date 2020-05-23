package glm.design_patterns.head_first.ch12_compound_duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator=observers.iterator();
        while(iterator.hasNext()){
            Observer observer=(Observer)iterator.next();
            observer.update(duck);
        }
    }

}