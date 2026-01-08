package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RestaurantOrder;
import com.example.demo.repository.RestaurantRepository;


@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService{

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public void addOrder(RestaurantOrder restaurantOrder) {
		// TODO Auto-generated method stub
		restaurantRepository.save(restaurantOrder);
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		restaurantRepository.deleteById(id);
	}

	@Override
	public RestaurantOrder getOrder(int id) {
		// TODO Auto-generated method stub
		return restaurantRepository.findById(id).get();
	}

}
