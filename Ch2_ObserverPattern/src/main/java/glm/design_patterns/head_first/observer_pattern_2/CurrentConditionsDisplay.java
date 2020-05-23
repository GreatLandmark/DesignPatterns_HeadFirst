package glm.design_patterns.head_first.observer_pattern_2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void update(Observable observable,Object arg){
       if(observable instanceof WeatherData){
           WeatherData weatherData=(WeatherData)observable;
           this.temperature=weatherData.getTemperature();
           this.humidity=weatherData.getHumidity();
           display();
       }
    }
    public void display(){
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}