package glm.design_patterns.head_first.ch12_compound_duck;

// import java.util.Observer;

public interface QuackObservable {
    public  void registerObserver(Observer observer);
    
    public  void notifyObserver();
}