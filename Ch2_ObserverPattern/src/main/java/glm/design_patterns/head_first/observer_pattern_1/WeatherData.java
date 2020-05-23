package glm.design_patterns.head_first.observer_pattern_1;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<Observer>();
    }

	@Override
	public void notifyObservers() {
        for(var o:observers){
            o.update(temperature, humidity, pressure);
        }
		// for (int i=0;i<observers.size();i++){
        //     Observer observer=(Observer)observers.get(i);
        //     observer.update(temperature, humidity, pressure);
        // }
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}