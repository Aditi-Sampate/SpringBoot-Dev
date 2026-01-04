package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CollegeAddmission;
import com.example.demo.service.CollegeAddmissionService;

@RestController
@RequestMapping("addmission")
public class CollegeAddmissionController {

	@Autowired
	CollegeAddmissionService collegeAddmissionService;
	
	@PostMapping("/add")
	public String addAddmission(@RequestBody CollegeAddmission collegeAddmission)
	{
		collegeAddmissionService.addAddmission(collegeAddmission);
		return"Addmission Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAddmission(@PathVariable int id)
	{
		collegeAddmissionService.deleteAddmission(id);
		return "Addmission Deleted From Database";
	}
	
	@GetMapping("/{id}")
	public CollegeAddmission getAddmission(@PathVariable int id)
	{
		return collegeAddmissionService.getAddmission(id);
	}
	
}
