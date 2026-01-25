package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Enrollment;
import com.example.demo.repository.EnrollmentRepository;
import com.example.demo.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

	@Autowired
	EnrollmentRepository enrollmentRepository;
	
	@Override
	public void addStudent(Enrollment enrollment) {
		// TODO Auto-generated method stub
		enrollmentRepository.save(enrollment);
	}

	@Override
	public Enrollment updateStudent(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.save(enrollment);
	}

	@Override
	public List<Enrollment> getAllStudent(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.findAll();
	}

	@Override
	public Enrollment getStudent(int enrollmentId) {
		// TODO Auto-generated method stub
		return enrollmentRepository.findById(enrollmentId).get();
	}

	@Override
	public void deleteAllStudent(Enrollment enrollment) {
		// TODO Auto-generated method stub
		enrollmentRepository.deleteAll();
	}

	@Override
	public void deleteStudent(int enrollmentId) {
		// TODO Auto-generated method stub
		enrollmentRepository.deleteById(enrollmentId);
	}


}
