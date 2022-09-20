package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airportMap;

    public FlightFinder(Map<String, Boolean> airportMap) {
        this.airportMap = airportMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        boolean allowedAirports = airportMap.containsKey(flight.getArrivalAirport()) && airportMap.containsKey(flight.getDepartureAirport());
        if (!allowedAirports) {
            throw new RouteNotFoundException("Airport does not exist");
        } else {
            boolean allowedToLand = airportMap.get(flight.getArrivalAirport());
            if (!allowedToLand) {
                System.out.println("This Airport is not on the allowed arrival list -> " + flight.getArrivalAirport());
            } else
                System.out.println("Success");
        }
    }

}