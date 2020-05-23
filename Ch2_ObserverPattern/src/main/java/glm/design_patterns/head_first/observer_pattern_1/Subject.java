package glm.design_patterns.head_first.observer_pattern_1;
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}