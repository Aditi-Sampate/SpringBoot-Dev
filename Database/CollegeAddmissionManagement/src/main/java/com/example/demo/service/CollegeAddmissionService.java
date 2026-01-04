package com.example.demo.service;

import com.example.demo.entity.CollegeAddmission;

public interface CollegeAddmissionService {

	void addAddmission(CollegeAddmission collegeAddmission);
	
	void deleteAddmission(int id);
	
	CollegeAddmission getAddmission(int id);
}
