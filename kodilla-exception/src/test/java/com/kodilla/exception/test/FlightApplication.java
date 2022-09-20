package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApplication {

    public static void main (String[] args)  {
        Flight flight1 = new Flight("Warsaw", "Tokyo");
        Flight flight2 = new Flight("Shanghai", "Helsinki");
        Flight flight3 = new Flight("Seoul", "Czestochowa");

            Map<String, Boolean> allowedAirports = new HashMap<>();
            allowedAirports.put("Shanghai", true);
            allowedAirports.put("Tokyo", true);
            allowedAirports.put("Warsaw", true);
            allowedAirports.put("Helsinki", false);
            allowedAirports.put("Rome", false);
            allowedAirports.put("Berlin", true);
            allowedAirports.put("Seoul", true);
            allowedAirports.put("Amsterdam", false);
            allowedAirports.put("Beijing", false);

        FlightFinder flightFinder = new FlightFinder(allowedAirports);

        System.out.println("Checking flight from airport " + flight1.getDepartureAirport()+ " to airport " + flight1.getArrivalAirport());
        try {flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }

        System.out.println("Checking flight from airport " + flight2.getDepartureAirport()+ " to airport " + flight2.getArrivalAirport());
        try {flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }

        System.out.println("Checking flight from airport " + flight3.getDepartureAirport()+ " to airport " + flight3.getArrivalAirport());
        try {flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }
    }
}
