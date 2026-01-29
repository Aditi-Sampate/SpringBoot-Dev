package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Property;
import com.example.demo.service.PropertyService;

@RestController
@RequestMapping("property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;

	@PostMapping("/add")
	public String addProperty(@RequestBody Property property)
	{
		propertyService.saveProperty(property);
		return MessageConstant.PROPERTY_ADDED;
	}
	
	@GetMapping("/get/{propertyId}")
	Property getProperty(@PathVariable int propertyId)
	{
		return propertyService.getProperty(propertyId);
		
	}
	
	@GetMapping("/getAll")
	List<Property> getAllProperty(Property property)
	{
		return propertyService.getAllProperty(property);
		
	}
	
	@DeleteMapping("/delete/{propertyId}")
	public String deleteProperty(@PathVariable int propertyId)
	{
		propertyService.deleteProperty(propertyId);
		return MessageConstant.PROPERTY_DELETED;
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllProperty(@RequestBody Property property)
	{
		propertyService.deleteAllProperty(property);
		return MessageConstant.ALL_PROPERTY_DELETED;
	}
	
}
