package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.VehicleService;
import com.example.demo.serviceImpl.CarServiceImpl;
import com.example.demo.serviceImpl.JeepServiceImpl;
import com.example.demo.serviceImpl.ScootyServiceImpl;

@RestController
@RequestMapping("vehicle")
public class StopVehicleController {

	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("stop/{type}")
	public String VehicleStop(@PathVariable String type)
	{
		if(type.equals("car"))
		{
			vehicleService = (VehicleService) applicationContext.getBean(CarServiceImpl.class);
		}
		else if (type.equals("jeep")) 
		{
			vehicleService = (VehicleService) applicationContext.getBean(JeepServiceImpl.class);
		}
		else if (type.equals("scooty")) 
		{
			vehicleService =  (VehicleService) applicationContext.getBean(ScootyServiceImpl.class);
		}
		return vehicleService.stopService();
	}
}
