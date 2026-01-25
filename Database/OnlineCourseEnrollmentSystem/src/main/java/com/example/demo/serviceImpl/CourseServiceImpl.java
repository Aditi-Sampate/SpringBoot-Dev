package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		 courseRepository.save(course);
		 
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return courseRepository.findById(courseId).get();
	}

	@Override
	public List<Course> getAllCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		 courseRepository.deleteById(courseId);
		 
	}

	@Override
	public void deleteAllCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.deleteAll();
		
	}

}
