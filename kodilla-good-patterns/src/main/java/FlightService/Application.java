package FlightService;


public class Application {

    FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
    FlightRequest flightRequest = flightRequestRetriever.retrieve();
    FlightService flightService = new FlightService();




}
