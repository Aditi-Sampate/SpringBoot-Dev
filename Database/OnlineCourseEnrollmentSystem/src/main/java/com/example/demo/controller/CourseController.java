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
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@PostMapping("/add")
	String addCourse(@RequestBody Course course) 
	{
		courseService.addCourse(course);
		return MessageConstant.COURSE_ADD;
	}
	
	@PutMapping("/update")
	Course updateCourse(@RequestBody Course course)
	{
		return courseService.updateCourse(course);
		
	}
	
	@GetMapping("/{courseId}")
	Course getCourse(@PathVariable int courseId)
	{
		return courseService.getCourse(courseId);
	}
	
	@GetMapping("/getAll")
	List<Course> getAllCourse(@RequestBody Course course)
	{
		return courseService.getAllCourse(course);
	}
	
	@DeleteMapping("/{courseId}")
	String deleteCourse(@PathVariable int courseId)
	{
		courseService.deleteCourse(courseId);
		return MessageConstant.COURSE_DELETED;
	}
	
	@DeleteMapping("/deleteAll")
	String deleteAllCourse(@RequestBody Course course)
	{
		courseService.deleteAllCourse(course);
		return MessageConstant.COURSE_ALLDELETED;
	}
}
