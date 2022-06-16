package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage() {
        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average = average + temperature.getValue();
        }
        return average / temperatures.getTemperatures().size();
    }

    public double calculateMedian() {

        double median = 0;
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperatureList);
        if (temperatureList.size() == 0) {
            return -1;
        } else if (temperatureList.size() % 2 == 0) {
            median = temperatureList.get((temperatureList.size() -1) /2);
        } else {
            median = (temperatureList.get((temperatureList.size() -1) / 2) + temperatureList.get(temperatureList.size() / 2)) / 2;
        }
        return median;
    }
}