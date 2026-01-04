package com.example.demo.service;

import com.example.demo.entity.Appointment;

public interface AppointmentService {

	void addAppointment(Appointment appointment);
	
	void deleteAppointment(int id);
	
	Appointment getAppointment(int id);
}
