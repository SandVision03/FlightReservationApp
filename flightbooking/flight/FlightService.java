package com.services.flightbooking.flight;

import java.util.List;

import com.services.flightbooking.domain.entity.Flight;

public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
