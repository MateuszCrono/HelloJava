package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> AirportMap;

    public FlightFinder() {
        AirportMap = airportDataBase();
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("Shanghai", true);
        airportDataBase.put("Tokyo", true);
        airportDataBase.put("Warsaw", true);
        airportDataBase.put("Helsinki", false);
        airportDataBase.put("Rome", false);
        airportDataBase.put("Berlin", true);
        airportDataBase.put("Seoul", true);
        airportDataBase.put("Amsterdam", false);
        airportDataBase.put("Beijing", false);

        return airportDataBase;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }


    public boolean findAirport(String airportName) throws RouteNotFoundException {
        if (airportDataBase().containsKey(airportName)) {
            return true;
        } else {
            throw new RouteNotFoundException("Airport does not exist in the database");
        }
    }
}
