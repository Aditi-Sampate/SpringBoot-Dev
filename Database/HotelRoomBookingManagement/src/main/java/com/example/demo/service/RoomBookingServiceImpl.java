package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RoomBooking;
import com.example.demo.repository.RoomBookingRepository;

@Service
public class RoomBookingServiceImpl implements RoomBookingService{

	@Autowired
	RoomBookingRepository roomBookingRepository;
	
	@Override
	public void addBooking(RoomBooking roomBooking) {
		// TODO Auto-generated method stub
		roomBookingRepository.save(roomBooking);
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub
		roomBookingRepository.deleteById(id);
	}

	@Override
	public RoomBooking getBooking(int id) {
		// TODO Auto-generated method stub
		return roomBookingRepository.findById(id).get();
	}
	
}
