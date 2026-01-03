package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface TeacherService {

	void saveTeacher(Teacher teacher);
	
	void deleteTeacher(int id);
	
	Teacher getTeacher(int id);
	
}
