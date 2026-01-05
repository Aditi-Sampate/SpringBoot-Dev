package com.example.demo.service;

import com.example.demo.entity.ECommerce;

public interface ECommerceService {

	void addProduct(ECommerce eCommerce);
	
	void deleteProduct(int id);
	
	ECommerce getProduct(int id);
}
