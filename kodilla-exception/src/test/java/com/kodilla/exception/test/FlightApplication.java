package com.kodilla.exception.test;

public class FlightApplication {

    public static void main (String[] args)  {
        Flight flight1 = new Flight("Warsaw", "Tokyo");
        Flight flight2 = new Flight("Shanghai", "Berlin");
        Flight flight3 = new Flight("Seoul", "Czestochowa");

        FlightFinder flightFinder = new FlightFinder();



        try {
            flightFinder.findFlight(flight1);
        System.out.println("Flying from airport " + flight1.getDepartureAirport()+ " to airport " + flight1.getArrivalAirport());

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }

        try {flightFinder.findFlight(flight2);
            System.out.println("Flying from airport " + flight2.getDepartureAirport()+ " to airport " + flight2.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }

        try {flightFinder.findFlight(flight3);
            System.out.println("Flying from airport " + flight3.getDepartureAirport()+ " to airport " + flight3.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found on the list : "  + e);
        }
    }
}
