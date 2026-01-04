package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CollegeAddmission;
import com.example.demo.repository.CollegeAddmissionRepository;

@Service
public class CollegeAddmissionServiceImpl implements CollegeAddmissionService{

	@Autowired
	CollegeAddmissionRepository collegeAddmissionRepository;
	
	@Override
	public void addAddmission(CollegeAddmission collegeAddmission) {
		// TODO Auto-generated method stub
		collegeAddmissionRepository.save(collegeAddmission);
	}

	@Override
	public void deleteAddmission(int id) {
		// TODO Auto-generated method stub
		collegeAddmissionRepository.deleteById(id);
	}

	@Override
	public CollegeAddmission getAddmission(int id) {
		// TODO Auto-generated method stub
		return collegeAddmissionRepository.findById(id).get();
	}

}
