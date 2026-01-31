package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Airport;
import com.example.demo.repository.AirportRepository;
import com.example.demo.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{

	@Autowired
	AirportRepository airportRepository;
	
	@Override
	public Airport addAirport(Airport airport) {
		// TODO Auto-generated method stub
		return airportRepository.save(airport);
	}

	@Override
	public Airport getAirportById(int airportId) {
		// TODO Auto-generated method stub
		return airportRepository.findById(airportId).get();
	}

	@Override
	public List<Airport> getAllAirport(Airport airport) {
		// TODO Auto-generated method stub
		return airportRepository.findAll();
	}

	@Override
	public void deleteAirportById(int airportId) {
		// TODO Auto-generated method stub
		airportRepository.deleteById(airportId);
	}

	@Override
	public void deleteAllAirport(Airport airport) {
		// TODO Auto-generated method stub
		airportRepository.deleteAll();
	}

	@Override
	public Airport update(Airport airport) {
		// TODO Auto-generated method stub
		return airportRepository.save(airport);
	}

}
