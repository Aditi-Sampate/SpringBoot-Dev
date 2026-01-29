package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Property;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	@Autowired
	PropertyRepository propertyRepository;

	@Override
	public void saveProperty(Property property) {
		// TODO Auto-generated method stub
		propertyRepository.save(property);
	}

	@Override
	public void deleteProperty(int propertyId) {
		// TODO Auto-generated method stub
		propertyRepository.deleteById(propertyId);
	}

	@Override
	public void deleteAllProperty(Property property) {
		// TODO Auto-generated method stub
		propertyRepository.deleteAll();
	}

	@Override
	public Property getProperty(int propertyId) {
		// TODO Auto-generated method stub
		return propertyRepository.findById(propertyId).get();
	}

	@Override
	public List<Property> getAllProperty(Property property) {
		// TODO Auto-generated method stub
		return propertyRepository.findAll();
	}
	
}
