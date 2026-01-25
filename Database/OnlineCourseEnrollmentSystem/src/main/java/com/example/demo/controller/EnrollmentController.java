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
import com.example.demo.entity.Enrollment;
import com.example.demo.service.EnrollmentService;

@RestController
@RequestMapping("enrollment")
public class EnrollmentController {

	@Autowired
	EnrollmentService enrollmentService;

    
	@PostMapping("add")
	public String addStudent(@RequestBody Enrollment enrollment)
	{
		enrollmentService.addStudent(enrollment);
		return MessageConstant.ENROLLMENT_ADDED;
		
	}
	
	@PutMapping("update")
	public Enrollment updateStudent(@RequestBody Enrollment enrollment)
	{
		return enrollmentService.updateStudent(enrollment);
		
	}
	
	@GetMapping("get")
	public List<Enrollment> getAllStudent(@RequestBody Enrollment enrollment)
	{
		return enrollmentService.getAllStudent(enrollment);
	}
	
	@GetMapping("get/{enrollmentId}")
	public Enrollment getStudent(@PathVariable int enrollmentId)
	{ 
		return enrollmentService.getStudent(enrollmentId);
			
	}
	@DeleteMapping("delete")
	public String deleteAllStuent(@RequestBody Enrollment enrollment)
	{
		enrollmentService.deleteAllStudent(enrollment);
		return MessageConstant.ENROLLMENT_ALL_DELETE;
	}
	
	@DeleteMapping("delete/{enrollmentId}")
	public String deleteStudent(@PathVariable int enrollmentId)
	{
		enrollmentService.deleteStudent(enrollmentId);
		return MessageConstant.ENROLLMENT_DELETE;
	}

}
