package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airportMap;

    public FlightFinder(Map<String, Boolean> airportMap) {
        this.airportMap = airportMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        boolean allowedAirports = airportMap.containsKey(flight.getArrivalAirport()) && airportMap.containsKey(flight.getDepartureAirport());
        if (!allowedAirports) {
            throw new RouteNotFoundException("Airport does not exist");
        }
        else return true;
    }

    public void print(Flight flight) {
        boolean allowedAirports = airportMap.containsKey(flight.getArrivalAirport()) && airportMap.containsKey(flight.getDepartureAirport());
        boolean allowedToLand = airportMap.get(flight.getArrivalAirport());
        if (allowedAirports && allowedToLand) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is allowed ");
        }
        else {
            System.out.println("Flight to " + flight.getArrivalAirport() + " is forbidden ");
        }

    }
}
