package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

	 void addStudent(Student student);
	
	 void deleteStudent(int id);
	
	 Student getStudent(int id);
	
	
}
