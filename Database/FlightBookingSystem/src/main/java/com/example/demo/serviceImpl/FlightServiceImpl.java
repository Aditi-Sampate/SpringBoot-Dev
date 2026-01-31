package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;
import com.example.demo.repository.FlightRepository;
import com.example.demo.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	@Override
	public Flight getFlightById(int flightId) {
		// TODO Auto-generated method stub
		return flightRepository.findById(flightId).get();
	}

	@Override
	public List<Flight> getAllFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	@Override
	public Flight updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	@Override
	public void deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		flightRepository.deleteById(flightId);
	}

	@Override
	public void deleteAllFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.deleteAll();
	}

}
