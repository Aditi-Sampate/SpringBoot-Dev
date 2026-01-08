package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RestaurantOrder;
import com.example.demo.service.RestaurantOrderService;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

	@Autowired
	RestaurantOrderService restaurantOrderService;
	
	@PostMapping("/add")
	public String addRestaurantOrder(@RequestBody RestaurantOrder restaurantOrder)
	{
		restaurantOrderService.addOrder(restaurantOrder);
		return "Restaurant Order is Added";
	}
	
	@DeleteMapping("/{id}")
	public String deleteRestaurantOrder(@PathVariable int id)
	{
		restaurantOrderService.deleteOrder(id);
		return "Restaurant Order is Deleted";
	}
	
	@GetMapping("/{id}")
	public RestaurantOrder getRestaurantOrder(@PathVariable int id)
	{
		return restaurantOrderService.getOrder(id);
	}
}
