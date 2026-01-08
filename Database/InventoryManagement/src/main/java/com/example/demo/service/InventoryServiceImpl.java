package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inventor;
import com.example.demo.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	InventoryRepository inventoryRepository;
	
	@Override
	public void addProduct(Inventor inventor) {
		// TODO Auto-generated method stub
		inventoryRepository.save(inventor);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		inventoryRepository.deleteById(id);	
	
	}

	@Override
	public Inventor getProduct(int id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findById(id).get();
	}

}
