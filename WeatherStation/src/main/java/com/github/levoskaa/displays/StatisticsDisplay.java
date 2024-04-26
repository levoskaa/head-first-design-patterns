package com.github.levoskaa.displays;

import com.github.levoskaa.Observer;
import com.github.levoskaa.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        var newTemp = weatherData.getTemperature();
        tempSum += newTemp;
        numReadings++;
        maxTemp = Math.max(maxTemp, newTemp);
        minTemp = Math.min(minTemp, newTemp);
        display();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f%n",
                tempSum / numReadings, maxTemp, minTemp);
    }
}
