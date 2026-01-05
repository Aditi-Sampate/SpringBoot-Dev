package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ECommerce;
import com.example.demo.service.ECommerceService;

@RestController
@RequestMapping("ecommerce")
public class ECommerceController {

	@Autowired
	ECommerceService eCommerceService;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody ECommerce eCommerce)
	{
		eCommerceService.addProduct(eCommerce);
		return "Product Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		eCommerceService.deleteProduct(id);
		return "Product Deleted From Database";
	
	}
	
	@GetMapping("/{id}")
	public ECommerce getProduct(@PathVariable int id)
	{
		return eCommerceService.getProduct(id);
	}
}
