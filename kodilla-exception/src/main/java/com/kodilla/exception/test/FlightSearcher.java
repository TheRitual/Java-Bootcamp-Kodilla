package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> flights = new HashMap<>();
        flights.put("GLS",true);
        flights.put("LND",false);
        flights.put("LUT",true);
        flights.put("WAW",true);
        flights.put("WDC",false);
        String dest = flight.getArrivalAirport();

        boolean result;

        if(flights.containsKey(dest)) {
            result = flights.get(dest);
        } else {
            throw new RouteNotFoundException("Route " + dest + " not found!");
        }

        return result;
    }

    public static void main(String[] args) {
        FlightSearcher fs = new FlightSearcher();
        try {
            fs.findFlight(new Flight("GLS", "LUT"));
            fs.findFlight(new Flight("GLS", "WDC"));
            fs.findFlight(new Flight("GLS", "KAT"));
        } catch (RouteNotFoundException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
