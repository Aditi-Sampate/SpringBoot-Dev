package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public void addBooking(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub
		vehicleRepository.deleteById(id);
	}

	@Override
	public Vehicle getBooking(int id) {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(id).get();
	}

}
