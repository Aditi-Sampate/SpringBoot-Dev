//Setter Dependency Injection

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FoodOrderService;
import com.example.demo.serviceImpl.CloudKitchenOrderServiceImpl;
import com.example.demo.serviceImpl.HomeChefOrderServiceImpl;
import com.example.demo.serviceImpl.RestaurantOrderServiceImpl;

@RestController
@RequestMapping("food")
public class FoodOrderController {

	
	private CloudKitchenOrderServiceImpl cloudOrderServiceImpl;
	private RestaurantOrderServiceImpl restaurantServiceImpl;
	private HomeChefOrderServiceImpl homeServiceImpl;

	@Autowired
	public void setCloudService(CloudKitchenOrderServiceImpl cloudOrderServiceImpl)
	{
		this.cloudOrderServiceImpl = cloudOrderServiceImpl;
	}
	
	@Autowired
	public void setRestoOrderService(RestaurantOrderServiceImpl restaurantServiceImpl)
	{
		this.restaurantServiceImpl = restaurantServiceImpl;
	}
	
	@Autowired
	public void setHomeService(HomeChefOrderServiceImpl homeServiceImpl)
	{
		this.homeServiceImpl = homeServiceImpl;
	}
	
	
	@Autowired
	FoodOrderService foodOrderService;
	
	@GetMapping("/{type}")
	public String OrderPhases(@PathVariable String type)
	{
		
		switch(type)
		{
		case "cloud":
			foodOrderService = cloudOrderServiceImpl;
			break;
		
		case "home":
			foodOrderService = homeServiceImpl;
			break;
			
		case "resto":
			foodOrderService = restaurantServiceImpl;
			break;
			
		default:
			return "invalid";
			
		}
		
		return foodOrderService.placeOrder() + "---->"+ foodOrderService.trackOrder()+ "------->" + foodOrderService.cancleOrder();
		
	}
}
