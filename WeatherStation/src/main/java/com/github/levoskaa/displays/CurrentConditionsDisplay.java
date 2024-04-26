package com.github.levoskaa.displays;

import com.github.levoskaa.Observer;
import com.github.levoskaa.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.1f F degrees and %.1f%% humidity%n",
                temperature, humidity);
    }
}
