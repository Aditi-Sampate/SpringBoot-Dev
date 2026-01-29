package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Property;

public interface PropertyService {

	void saveProperty(Property property);
	
	void deleteProperty(int propertyId);
	
	void deleteAllProperty(Property property);
	
	Property getProperty(int propertyId);
	
	List<Property> getAllProperty(Property property);
	
}
