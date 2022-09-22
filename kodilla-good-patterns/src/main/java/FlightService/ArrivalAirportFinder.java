package FlightService;

import java.util.Set;
import java.util.stream.Collectors;

public class ArrivalAirportFinder implements FlightFinder {

    private String arrivalAirport;

    public ArrivalAirportFinder(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    @Override
    public void FindFlights() {
        Set<Flight> availableFlightsTo = (new FlightRepository().getFlightRepository().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet()));

        if (availableFlightsTo.size() == 0) {
            System.out.println("No flights arriving to this: " + arrivalAirport + " airport");
        } else {
            System.out.println("Please find our flights to : " + arrivalAirport);
            availableFlightsTo.stream()
                    .map(f -> "Departure: " + f.getDepartureAirport() + " : Arrival: " + f.getArrivalAirport())
                    .forEach(System.out::println);
        }
    }
}
