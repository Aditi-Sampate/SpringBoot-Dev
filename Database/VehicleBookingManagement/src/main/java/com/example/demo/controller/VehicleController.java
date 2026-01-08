package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/add")
	public String addVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleService.addBooking(vehicle);
		return "Vehicle Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteVehicle(@PathVariable int id)
	{
		vehicleService.deleteBooking(id);
		return "Vehicle Deleted From The Database";
	}
	
	@GetMapping("/{id}")
	public Vehicle getVehicle(@PathVariable int id)
	{
		return vehicleService.getBooking(id);
	}
	
}
