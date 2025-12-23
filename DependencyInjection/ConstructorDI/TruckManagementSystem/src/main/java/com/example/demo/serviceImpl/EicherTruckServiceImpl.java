package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.TruckService;

@Service
public class EicherTruckServiceImpl implements TruckService{

	@Override
	public String startTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.EICHER_START;
	}

	@Override
	public String driveTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.EICHER_DRIVE;
	}

	@Override
	public String stopTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.EICHER_STOP;
	}

}
