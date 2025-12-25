package com.example.demo.serviceImpl;

import java.security.MessageDigest;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.OrderProcessingService;

@Service
public class GroceryOrderServiceImpl implements OrderProcessingService{

	@Override
	public String createOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.GROCERY_CREATE_ORDER;
	}

	@Override
	public String processPayment() {
		// TODO Auto-generated method stub
		return MessageConstants.GROCERY_PROCESS_ORDER;
	}

	@Override
	public String shipOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.GROCERY_SHIP_ORDER;
	}

}
