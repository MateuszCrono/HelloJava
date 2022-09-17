package FlightService;


public class Application {

    FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
    FlightRequest flightRequest = flightRequestRetriever.retrieve();

    FlightRepository flightRepository = new FlightRepository();
    FlightService flightService = new FlightService();
        flightService.
        flightService.searchFlightsTo(flightRequest);
        flightService.searchFlightsVia(flightRequest);


}
