package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.OrderProcessingService;

@Service
@Primary
public class ClothingOrderServiceImpl implements OrderProcessingService{

	@Override
	public String createOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOTHING_CREATE_ORDER;
	}

	@Override
	public String processPayment() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOTHING_PROCESS_ORDER;
	}

	@Override
	public String shipOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOTHING_SHIP_ORDER;
	}

}
