package airport;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static long findCountAircraftWithModelAirbus(Airport airport, String model) {
        return airport.getAllAircrafts().stream()
                .filter(a -> a.getModel().contains(model)).count();
    }

    public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport) {
        return airport.getTerminals().stream()
                .collect(Collectors.toMap(Terminal::getName, terminal -> terminal.getParkedAircrafts().size()));
    }

    public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours) {
        List<Flight> flights = airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .toList();

        return flights.stream()
                .filter(f -> f.getDate().isBefore(LocalDateTime.now()
                        .plusHours(hours)
                        .atZone(ZoneId.systemDefault())
                        .toInstant()) && f.getDate().isAfter(LocalDateTime.now().
                        atZone(ZoneId.systemDefault())
                        .toInstant()) && f.getType().equals(Flight.Type.DEPARTURE))
                .toList();
    }

    public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName) {
        List<Flight> flights = airport.getTerminals().stream()
                .filter(terminal -> terminal.getName().equals(terminalName))
                .flatMap(terminal -> terminal.getFlights().stream())
                .toList();
            if(flights.isEmpty())
                return Optional.empty();
            Flight firstFlight = flights.get(0);

            for(Flight f : flights) {
                if(firstFlight.getDate().isBefore(f.getDate()))
                    firstFlight = f;
            }
        return Optional.of(firstFlight);
    }
}