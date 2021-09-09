package com.services.flightbooking.airport;

import java.util.List;

import com.services.flightbooking.domain.entity.Airport;

public interface AirportService {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
