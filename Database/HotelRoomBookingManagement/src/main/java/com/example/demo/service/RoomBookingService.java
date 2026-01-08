package com.example.demo.service;

import com.example.demo.entity.RoomBooking;

public interface RoomBookingService {

	void addBooking(RoomBooking roomBooking);
	
	void deleteBooking(int id);
	
	RoomBooking getBooking(int id);
	
}
