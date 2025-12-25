package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.FoodOrderService;

@Service
@Primary
public class CloudKitchenOrderServiceImpl implements FoodOrderService{

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOUDKITCHEN_PLACE_ORDER;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOUDKITCHER_TRACK_ORDER;
	}

	@Override
	public String cancleOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.CLOUDKITCHER_CANCLE_ORDER;
	}

}
