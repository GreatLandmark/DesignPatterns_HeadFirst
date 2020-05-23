package glm.design_patterns.head_first;

import glm.design_patterns.head_first.observer_pattern_2.*;


public class WeatherStation2Test {

    public static void main(String[] args) {
        demo1();
    }

    static void demo1(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // var statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(90, 75.6f, 20.4f);
        weatherData.setMeasurements(100, 80.2f, 17.999f);
    }
    
}