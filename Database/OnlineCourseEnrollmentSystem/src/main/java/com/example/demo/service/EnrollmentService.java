package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Enrollment;

public interface EnrollmentService {

	void addStudent(Enrollment enrollment);
	
	Enrollment updateStudent(Enrollment enrollment);
	
	List<Enrollment> getAllStudent(Enrollment enrollment);
	
	Enrollment getStudent(int enrollmentId);
	
	void deleteAllStudent(Enrollment enrollment);
	
	void deleteStudent(int enrollmentId);
}
