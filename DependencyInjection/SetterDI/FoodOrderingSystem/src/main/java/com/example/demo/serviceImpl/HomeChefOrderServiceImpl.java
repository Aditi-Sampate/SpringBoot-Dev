package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.FoodOrderService;

@Service
public class HomeChefOrderServiceImpl implements FoodOrderService{

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.HOMECHEF_PLACE_ORDER;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.HOMECHEF_TRACK_ORDER;
	}

	@Override
	public String cancleOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.HOMECHEF_CANCLE_ORDER;
	}

}
