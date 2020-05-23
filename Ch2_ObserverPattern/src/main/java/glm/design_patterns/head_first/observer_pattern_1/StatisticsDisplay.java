package glm.design_patterns.head_first.observer_pattern_1;

import java.util.ArrayList;
import java.util.Arrays;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperature = new ArrayList<Float>();
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature.add(temperature);
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Statistics Display: temperature = " + temperature + "F degrees , humidity = " + humidity
                + " , pressure = " + pressure);
        // if (temperature.size() == 3) {
        //     // System.out.println(String.format(
        //     // "Statistics Display: name = Avg | Max | Min \n temperature = %f | %f | %f F
        //     // degrees \n humidity = %f% humidity , pressure = %f ",
        //     // (float)temperature.get(0), (float)temperature.get(1),
        //     // (float)temperature.get(2), humidity, pressure));
        //     System.out.printf(
        //             "Statistics Display:  name = Avg | Max | Min \n temperature = %.2f | %.2f | %.2f F degrees \n humidity = %.2f% humidity , pressure = %.2f ",
        //             (float) temperature.get(0), (float) temperature.get(1), (float) temperature.get(2), humidity,
        //             pressure);
        // }
    }

}