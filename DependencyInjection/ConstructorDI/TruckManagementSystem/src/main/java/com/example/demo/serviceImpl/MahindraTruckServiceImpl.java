package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.TruckService;

@Service
public class MahindraTruckServiceImpl implements TruckService{

	@Override
	public String startTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.MAHINDRA_START;
	}

	@Override
	public String driveTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.MAHINDRA_DRIVE;
	}

	@Override
	public String stopTruck() {
		// TODO Auto-generated method stub
		return MessageConstants.MAHINDRA_STOP;
	}

}
