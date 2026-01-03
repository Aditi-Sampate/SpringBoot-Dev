package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;

@Service
public class TeacherSerivceImpl implements TeacherService{

	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository.save(teacher);
		
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
		
	}

	@Override
	public Teacher getTeacher(int id) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherRepository.findById(id).get();
		
		return teacher;
	}

}
