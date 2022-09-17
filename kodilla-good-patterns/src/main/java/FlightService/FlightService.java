package FlightService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private FlightData flightdata;

    public FlightService(FlightData flightdata) {
        this.flightdata = flightdata;
    }

    public Set<Flight> availableFlightsFrom(String departureAirport) {
        return flightdata.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableFlightsTo(String arrivalAirport) {
        return flightdata.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> availableConnectingFlights(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> setOfFlights = new HashSet<>();

        flightdata.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List<Flight> temp = flightdata.getAvailableFlights().stream()
                            .filter(fl -> (flight.getArrivalAirport().equals(fl.getDepartureAirport()) && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if (temp.size() > 0) {
                        List<Flight> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(temp);
                        setOfFlights.add(flightsRoute);
                    }
                });
        return setOfFlights;
    }
}
