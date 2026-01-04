package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/add")
	public String addAppointment(@RequestBody Appointment appointment)
	{
		appointmentService.addAppointment(appointment);
		return "Appointment Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAppointment(@PathVariable int id)
	{
		appointmentService.deleteAppointment(id);
		return "Appointment Deleted from Database";
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointment(@PathVariable int id)
	{
		return appointmentService.getAppointment(id);
	}
}
