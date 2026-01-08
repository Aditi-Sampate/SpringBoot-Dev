package com.example.demo.service;

import com.example.demo.entity.Inventor;

public interface InventoryService {

	void addProduct(Inventor inventor);
	
	void deleteProduct(int id);
	
	Inventor getProduct(int id);
}
