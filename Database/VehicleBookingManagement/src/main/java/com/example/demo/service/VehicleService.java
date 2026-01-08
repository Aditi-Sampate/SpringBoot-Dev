package com.example.demo.service;

import com.example.demo.entity.Vehicle;

public interface VehicleService {

	void addBooking(Vehicle vehicle);
	
	void deleteBooking(int id);
	
	Vehicle getBooking(int id);
	
}
