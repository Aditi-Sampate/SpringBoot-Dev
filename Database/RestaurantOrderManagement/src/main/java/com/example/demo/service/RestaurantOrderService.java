package com.example.demo.service;

import com.example.demo.entity.RestaurantOrder;

public interface RestaurantOrderService {

void addOrder(RestaurantOrder restaurantOrder);
	
	void deleteOrder(int id);
	
	RestaurantOrder getOrder(int id);
	
}
