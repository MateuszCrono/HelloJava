package FlightService;

import java.util.HashSet;
import java.util.Set;

public class FlightRequestRetriever {

    private Flight flight;
    private FlightService flightService;

    public FlightRequestRetriever retrieve() {
        Set<Flight> availableFlights = new HashSet<>();
        availableFlights.add(new Flight("Warsaw", "Beijing"));
        availableFlights.add(new Flight("Warsaw", "Tokyo"));
        availableFlights.add(new Flight("Wroclaw", "NewYorkCity"));
        availableFlights.add(new Flight("Gdansk", "Helsinki"));
        availableFlights.add(new Flight("Gdansk", "NewYorkCity"));
        availableFlights.add(new Flight("Czestochowa", "Prague"));


        return availableFlights;
    }
}
