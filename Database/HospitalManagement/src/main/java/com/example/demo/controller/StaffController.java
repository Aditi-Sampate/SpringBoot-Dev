package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {

	@Autowired
	StaffService staffService;
	
	@PostMapping("/add")
	public String saveStaff(@RequestBody Staff staff)
	{
		staffService.saveStaff(staff);
		return "Staff are saved in database.";
	}
	
	@DeleteMapping("/{id}")
	public String deleteStaff(@PathVariable int id)
	{
		staffService.deleteStaff(id);
		return "Staff are deleted from database.";
	}
	
	@GetMapping("/{id}")
	public Staff getStaff(@PathVariable int id)
	{
		Staff staff=  staffService.getStaff(id);
		return staff;
	}
	
}
