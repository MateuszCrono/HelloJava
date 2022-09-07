package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airportMap;

    public FlightFinder(Map<String, Boolean> airportMap) {
        this.airportMap = airportMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean result = airportMap.get(flight.getArrivalAirport());
        if (result == null) {
            throw new RouteNotFoundException("Airport not exist");
        }
        else return result;
    }

    public void print(Flight flight) {
        Boolean result = airportMap.get(flight.getArrivalAirport());
        if (result) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is allowed ");
        }
        else {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is forbidden ");
        }
    }
}
