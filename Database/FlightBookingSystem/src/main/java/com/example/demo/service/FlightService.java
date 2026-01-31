package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Flight;

public interface FlightService {

	Flight addFlight(Flight flight);
	
	Flight getFlightById(int flightId);
	
	List<Flight> getAllFlight(Flight flight);
	
	Flight updateFlight(Flight flight);
	
	void deleteFlight(int flightId);
	
	void deleteAllFlight(Flight flight);
	
}
