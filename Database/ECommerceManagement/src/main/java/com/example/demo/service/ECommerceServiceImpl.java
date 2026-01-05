package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ECommerce;
import com.example.demo.repository.ECommerceRepository;

@Service
public class ECommerceServiceImpl implements ECommerceService{

	@Autowired
	ECommerceRepository eCommerceRepository;
	
	@Override
	public void addProduct(ECommerce eCommerce) {
		// TODO Auto-generated method stub
		eCommerceRepository.save(eCommerce);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		eCommerceRepository.deleteById(id);
	}

	@Override
	public ECommerce getProduct(int id) {
		// TODO Auto-generated method stub
		return eCommerceRepository.findById(id).get();
	}

}
