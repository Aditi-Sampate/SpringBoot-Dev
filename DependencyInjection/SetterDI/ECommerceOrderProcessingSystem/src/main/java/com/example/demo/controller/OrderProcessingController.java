package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderProcessingService;
import com.example.demo.serviceImpl.ClothingOrderServiceImpl;
import com.example.demo.serviceImpl.ElectronicsOrderServiceImpl;
import com.example.demo.serviceImpl.GroceryOrderServiceImpl;

@RestController
@RequestMapping("order")
public class OrderProcessingController {

    private GroceryOrderServiceImpl groceryOrderServiceImpl;

    private ElectronicsOrderServiceImpl electronicsOrderServiceImpl;

    private ClothingOrderServiceImpl clothingOrderServiceImpl;


    OrderProcessingController(ElectronicsOrderServiceImpl electronicsOrderServiceImpl, GroceryOrderServiceImpl groceryOrderServiceImpl) {
        this.electronicsOrderServiceImpl = electronicsOrderServiceImpl;
        this.groceryOrderServiceImpl = groceryOrderServiceImpl;
    }


    @Autowired
	public void setClothingOrderService(ClothingOrderServiceImpl clothingOrderService)
	{
		this.clothingOrderServiceImpl = clothingOrderService;
	}
    
    @Autowired
    public void setElectronicsOrderService(ElectronicsOrderServiceImpl electronicsOrderService)
    {
    	this.electronicsOrderServiceImpl = electronicsOrderService;
    }
 
    @Autowired
    public void setGroceryOrderSystem(GroceryOrderServiceImpl groceryOrderService)
    {
    	this.groceryOrderServiceImpl = groceryOrderService;
    }
    
    @Autowired
    OrderProcessingService orderProcessingService;
    
    @GetMapping("/{type}")
    public String orderApp(@PathVariable String type)
    {
    	switch(type)
    	{
    		case "cloth":
    			orderProcessingService = clothingOrderServiceImpl;
    			break;
    			
    		case "electronics":
    			orderProcessingService = electronicsOrderServiceImpl;
    			break;
    			
    		case "grocery":
    			orderProcessingService = groceryOrderServiceImpl;
    			break;
    			
    		default:
    			return "Invalid order type.";
    		
    	}
    	
    	
    	return orderProcessingService.createOrder() + "-------->"+ orderProcessingService.processPayment() + "------->"+ orderProcessingService.shipOrder();
    }
}

