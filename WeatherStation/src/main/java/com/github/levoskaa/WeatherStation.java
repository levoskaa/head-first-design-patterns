package com.github.levoskaa;

import com.github.levoskaa.displays.CurrentConditionsDisplay;
import com.github.levoskaa.displays.ForecastDisplay;
import com.github.levoskaa.displays.HeatIndexDisplay;
import com.github.levoskaa.displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);
        var heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}