package FlightService;

import java.util.HashSet;
import java.util.Set;

public final class FlightRepository {

    private final Set<Flight> flightRepository;

    public FlightRepository() {
        flightRepository = new HashSet<>();
        flightRepository.add(new Flight("Warsaw", "Beijing"));
        flightRepository.add(new Flight("Warsaw", "Tokyo"));
        flightRepository.add(new Flight("Wroclaw", "NewYorkCity"));
        flightRepository.add(new Flight("Gdansk", "Helsinki"));
        flightRepository.add(new Flight("Gdansk", "NewYorkCity"));
        flightRepository.add(new Flight("Czestochowa", "Prague"));
        flightRepository.add(new Flight("Czestochowa", "Warsaw"));
    }
    public Set<Flight> getFlightRepository() {
        return flightRepository;
    }
}

