package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.OrderProcessingService;

@Service
public class ElectronicsOrderServiceImpl implements OrderProcessingService{

	@Override
	public String createOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.ELECTRONIC_CREATE_ORDER;
	}

	@Override
	public String processPayment() {
		// TODO Auto-generated method stub
		return MessageConstants.ELECTRONIC_PROCESS_ORDER;
	}

	@Override
	public String shipOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.ELECTRONIC_SHIP_ORDER;
	}

}
