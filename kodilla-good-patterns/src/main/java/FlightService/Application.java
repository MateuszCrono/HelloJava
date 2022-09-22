package FlightService;


public class Application {

    public static void main(String[] args) {

        System.out.println("This is the list of all available flights : ");
        (new FlightRepository()).getFlightRepository().stream()
                .map(f -> "Departure: " + f.getDepartureAirport() + " -> Arrival: " + f.getArrivalAirport())
                .forEach(System.out::println);

        System.out.println("\nTesting Application Repository \n");

        FlightService flightService1 = new FlightService((new DepartureAirportFinder("Warsaw")));
        flightService1.execute();
        System.out.println();

        FlightService flightService2 = new FlightService((new ArrivalAirportFinder("Helsinki")));
        flightService2.execute();
        System.out.println();

        FlightService flightService3 = new FlightService((new ConnectionFlightFinder()));
        flightService3.execute();
        System.out.println();

    }
}
