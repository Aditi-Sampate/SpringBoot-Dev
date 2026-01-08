package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RoomBooking;
import com.example.demo.service.RoomBookingService;

@RestController
@RequestMapping("booking")
public class RoomBookingController {

	@Autowired
	RoomBookingService roomBookingService;
	
	@PostMapping("/add")
	public String addBooking(@RequestBody RoomBooking roomBooking)
	{
		roomBookingService.addBooking(roomBooking);
		return "Room Booking Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteBooking(@PathVariable int id)
	{
		roomBookingService.deleteBooking(id);
		return "Room Booking Deleted From Database";
	}
	
	@GetMapping("/{id}")
	public RoomBooking getBooking(@PathVariable int id)
	{
		return roomBookingService.getBooking(id);
	}
	
}
