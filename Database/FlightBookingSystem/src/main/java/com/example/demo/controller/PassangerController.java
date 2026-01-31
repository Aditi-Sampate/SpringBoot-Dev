package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Passanger;
import com.example.demo.service.PassangerService;

@RestController
@RequestMapping("passanger")
public class PassangerController {

	@Autowired
	PassangerService passangerService;
	
	@PostMapping("/add")
	String addPassanger(@RequestBody Passanger passanger)
	{
		passangerService.addPassanger(passanger);
		return MessageConstant.ADDPASSANGER;
	}
	
	@GetMapping("get/{passangerId}")
	Passanger getPassangerById(@PathVariable int passangerId)
	{
		return passangerService.getPassangerById(passangerId);
		
	}
	
	@GetMapping("getAll")
	List<Passanger> getAllPassanger(@RequestBody Passanger passanger)
	{
		return passangerService.getAllPassanger(passanger);
	}
	
	@DeleteMapping("delete/{passangerId}")
	String deletePassangerById(@PathVariable int passangerId) 
	{
		passangerService.deletePassangerById(passangerId);
		return MessageConstant.DELETEPASSANGER;
	}
	
	@DeleteMapping("deleteAll")
	String deleteAllPassanger(@RequestBody Passanger passanger)
	{
		passangerService.deleteAllPassanger(passanger);
		return MessageConstant.DELETEALLPASSANGER;
	}
	
	@PutMapping("update")
	Passanger updatePassanger(@RequestBody Passanger passanger)
	{
		return passangerService.updatePassanger(passanger);
	
	}

}
