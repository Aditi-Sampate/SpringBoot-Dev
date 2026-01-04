package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Override
	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepository.save(appointment);
	}

	@Override
	public void deleteAppointment(int id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
	}

	@Override
	public Appointment getAppointment(int id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(id).get();
	}

}
