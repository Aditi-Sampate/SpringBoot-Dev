package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Inventor;
import com.example.demo.service.InventoryService;

@RestController
@RequestMapping("inventory")
public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	@PostMapping("/add")
	public String addInventory(@RequestBody Inventor inventor)
	{
		inventoryService.addProduct(inventor);
		return "Inventor Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteInventory(@PathVariable int id)
	{
		inventoryService.deleteProduct(id);
		return "Inventor Deleted From Database";
	}
	
	@GetMapping("/{id}")
	public Inventor getInventory(@PathVariable int id)
	{
		return inventoryService.getProduct(id);
	}
	
}
