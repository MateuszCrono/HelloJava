package FlightService;

import java.util.Objects;

public class ConnectionFlight {
    private String departureAirport;
    private String connection;
    private String arrivalAirport;

    public ConnectionFlight( String departureAirport, String connection, String arrivalAirport) {
       this.departureAirport = departureAirport;
       this.connection = connection;
       this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getConnection() {
        return connection;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConnectionFlight that = (ConnectionFlight) o;
        return Objects.equals(departureAirport, that.departureAirport) && Objects.equals(connection, that.connection) && Objects.equals(arrivalAirport, that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, connection, arrivalAirport);
    }
}