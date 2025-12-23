package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TruckService;
import com.example.demo.serviceImpl.EicherTruckServiceImpl;
import com.example.demo.serviceImpl.MahindraTruckServiceImpl;
import com.example.demo.serviceImpl.TataAceTruckServiceImpl;
import com.example.demo.serviceImpl.VolvoTruckServiceImpl;


@RestController
@RequestMapping("truck")
public class TruckController {
	
	 private EicherTruckServiceImpl eicherTruckService;
	 private MahindraTruckServiceImpl mahindraTruckService;
	 private TataAceTruckServiceImpl tataAceService;
	 private VolvoTruckServiceImpl volvoTruckService;

	 TruckController(EicherTruckServiceImpl eicherTruckService,MahindraTruckServiceImpl mahindraTruckService ,TataAceTruckServiceImpl tataAceTruckService, VolvoTruckServiceImpl volvoTruckService)
	 {
		this.eicherTruckService = eicherTruckService; 
		this.mahindraTruckService = mahindraTruckService;
		this.tataAceService = tataAceTruckService;
		this.volvoTruckService = volvoTruckService;
		
		
	 }
	 
	 

	@GetMapping("/{type}")
	public String showTruckPhases(@PathVariable String type)
	{
		
		TruckService truckService = null;
		
		
		switch(type)
		{
			case "eicher":
				truckService= eicherTruckService;
				break;
				
			case "mahindra":
				truckService = mahindraTruckService;
				break;
			
			case "tataace":
				truckService = tataAceService;
				break;
				
			case "volvo":
				truckService = volvoTruckService;
			
		}
		
		
		
		return truckService.startTruck() +"---->"+ truckService.driveTruck() +"---->"+ truckService.stopTruck();
	}
}
