package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Mock
    private Temperatures temperaturesMock;


    @BeforeEach
    public void beforeEachTests() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }


    @Test
    @DisplayName("Test Calculating Weather Forecast")
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }

    @Test
    @DisplayName("Test Calculating Average weather in celsius")
    void testCalculateAverageWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        // when
        double averageResult = weatherForecast.calculateAverage();
        // then
        assertEquals(25.56, averageResult);
    }

    @Test
    @DisplayName("Test Calculating median weather with Odd Numbers")
    void testCalculateOddMedianWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        // when
        double medianResult = weatherForecast.calculateMedian();
        // then
        assertEquals(25.5, medianResult);

    }

    @Test
    @DisplayName("Test Calculating median weather with Even Numbers")
    void testCalculateEvenMedianWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        temperaturesMock.getTemperatures().put("Czestochowa", 20.5); // Adding 6th city

        // when
        double medianResult = weatherForecast.calculateMedian();
        // then
        assertEquals(25.2, medianResult);
    }
}