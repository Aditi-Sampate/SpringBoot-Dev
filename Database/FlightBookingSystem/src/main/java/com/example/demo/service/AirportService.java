package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Airport;

public interface AirportService {

	Airport addAirport(Airport airport);
	
	Airport getAirportById(int airportId);
	
	List<Airport> getAllAirport(Airport airport);
	
	void deleteAirportById(int airportId);
	
	void deleteAllAirport(Airport airport);
	
	Airport update(Airport airport);
}
