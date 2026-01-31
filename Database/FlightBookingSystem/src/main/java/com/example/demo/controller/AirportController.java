package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Airport;
import com.example.demo.service.AirportService;

@RestController
@RequestMapping("airport")
public class AirportController {

	@Autowired
	AirportService airportService;
	
	@PostMapping("/add")
	String addAirport(@RequestBody Airport airport)
	{
		airportService.addAirport(airport);
		return MessageConstant.ADDAIRPORT;
	}
	
	@GetMapping("/get/{airportId}")
	Airport getAirportById(@PathVariable int airportId)
	{
		return airportService.getAirportById(airportId);
		
	}
	
	@GetMapping("/getAll")
	List<Airport> getAllAirport(@RequestBody Airport airport)
	{
		return airportService.getAllAirport(airport);
		
	}
	
	@DeleteMapping("/delete/{airportId}")
	String deleteAirportById(@PathVariable int airportId)
	{
		airportService.deleteAirportById(airportId);
		return MessageConstant.DELETEAIRPORT;
	}
	
	@DeleteMapping("/deleteAll")
	String deleteAllAirport(@RequestBody Airport airport)
	{
		airportService.deleteAllAirport(airport);
		return MessageConstant.DELETEALLAIRPORT;
	}
	
	@PutMapping("/update")
	Airport update(@RequestBody Airport airport)
	{
		return airportService.update(airport);
	}
}
