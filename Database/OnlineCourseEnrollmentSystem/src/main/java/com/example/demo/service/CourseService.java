package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {

	void addCourse(Course course);
	
	Course updateCourse(Course course);
	
	Course getCourse(int courseId);
	
	List<Course> getAllCourse(Course course);
	
	void deleteCourse(int courseId);
	
	void deleteAllCourse(Course course);
	
}
