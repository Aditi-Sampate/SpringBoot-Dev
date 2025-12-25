package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.FoodOrderService;

@Service
public class RestaurantOrderServiceImpl implements FoodOrderService{

	@Override
	public String placeOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTAURANTORDER_PLACE_ORDER;
	}

	@Override
	public String trackOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTAURANTORDER_TRACK_ORDER;
	}

	@Override
	public String cancleOrder() {
		// TODO Auto-generated method stub
		return MessageConstants.RESTAURANTORDER_CANCLE_ORDER;
	}

}
