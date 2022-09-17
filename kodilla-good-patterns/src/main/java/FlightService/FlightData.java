package FlightService;

import java.util.Set;

public class FlightData {
    private Set<Flight> availableFlights;

    public FlightData(Set<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }
}