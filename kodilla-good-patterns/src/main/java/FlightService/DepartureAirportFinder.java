package FlightService;

import java.util.Set;
import java.util.stream.Collectors;

public class DepartureAirportFinder implements FlightFinder {

    private String departureAirport;

    public DepartureAirportFinder(String departureAirport) {
        this.departureAirport = departureAirport;
    }


    @Override
    public void findFlights() {
        Set<Flight> availableFlightsFrom = (new FlightRepository().getFlightRepository().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet()));

        if (availableFlightsFrom.size() == 0) {
            System.out.println("No flights departure from this: " + departureAirport + " airport");
        } else {
            System.out.println("Please find our flights from departure: " + departureAirport);
            availableFlightsFrom.stream()
                    .map(f -> "Departure: " + f.getDepartureAirport() + " : Arrival: " + f.getArrivalAirport())
                    .forEach(System.out::println);
        }
    }
}

