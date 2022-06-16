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

        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        int sizeOfList = temperatureList.size();

        for (int i = 0; i < sizeOfList; i++) {
            average += temperatureList.get(i);
        }
        return average / sizeOfList;
    }

    public double calculateMedian() {

        double median = 0;

        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperatureList);
        int sizeOfList = temperatureList.size();
        if (sizeOfList == 0) {
            return -1;
        } else if (sizeOfList % 2 == 0) {
            median = temperatureList.get((sizeOfList - 1) / 2);
        } else {
            median = (temperatureList.get((sizeOfList - 1) / 2) + temperatureList.get(sizeOfList / 2)) / 2;
        }
        return median;
    }
}