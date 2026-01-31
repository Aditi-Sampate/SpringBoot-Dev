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
import com.example.demo.entity.Flight;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("flight")
public class FlightController {

	@Autowired
	FlightService flightService;
	

	@PostMapping("/add")
	String addFlight(@RequestBody Flight flight)
	{
		flightService.addFlight(flight);
		return MessageConstant.ADDFLIGHT;
	}
	
	@GetMapping("get/{flightId}")
	Flight getFlightById(@PathVariable int flightId)
	{
		return flightService.getFlightById(flightId);
		
	}
	
	@GetMapping("getAll")
	List<Flight> getAllFlight(@RequestBody Flight flight)
	{
		return flightService.getAllFlight(flight);
	}
	
	@PutMapping("update")
	Flight updateFlight(@RequestBody Flight flight)
	{
		return flightService.updateFlight(flight);
	}
	
	@DeleteMapping("delete/{flightId}")
	String deleteFlight(@PathVariable int flightId)
	{
		flightService.deleteFlight(flightId);
		return MessageConstant.DELETEFLIGHT;
	}
	
	@DeleteMapping("deleteAll")
	String deleteAllFlight(@RequestBody Flight flight)
	{
		flightService.deleteAllFlight(flight);
		return MessageConstant.DELETEALLFLIGHT;
	}
	
}
