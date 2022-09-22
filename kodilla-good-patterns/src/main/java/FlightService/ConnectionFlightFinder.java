package FlightService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConnectionFlightFinder implements FlightFinder {

    private FlightRepository flightRepository;

    public ConnectionFlightFinder() {
        this.flightRepository = new FlightRepository();
    }

    @Override
    public void FindFlights() {
        Set<ConnectionFlight> availableConnectingFlights = new HashSet<>();
        for (Flight flight : flightRepository.getFlightRepository()) {
            Set<ConnectionFlight> temporarySet = flightRepository.getFlightRepository().stream()
                    .filter(f -> f.getDepartureAirport().equals(flight.getArrivalAirport()) && !(f.getArrivalAirport().equals(flight.getArrivalAirport())))
                    .map(f -> new ConnectionFlight(flight.getDepartureAirport(), f.getDepartureAirport(), f.getArrivalAirport()))
                    .collect(Collectors.toSet());

            availableConnectingFlights.addAll(temporarySet);
        }

        if (availableConnectingFlights.size() == 0) {
            System.out.println("Sorry there is no connecting flight");
        } else {
            System.out.println("We found connecting flights for you :");
            availableConnectingFlights.stream()
                    .map(f -> "Departure Airport : " + f.getDepartureAirport() +
                            " -> Connecting through : " + f.getConnection() +
                            " -> Arrival : " + f.getArrivalAirport())
                    .forEach(System.out::println);
        }
    }
}