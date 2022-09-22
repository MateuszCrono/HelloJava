package FlightService;

public class FlightService {

    private FlightFinder flightFinder;

    public FlightService(FlightFinder flightFinder) {
        this.flightFinder = flightFinder;
    }

    public void execute() {
        flightFinder.FindFlights();
    }
}


