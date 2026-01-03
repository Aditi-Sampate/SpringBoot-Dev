package com.example.demo.service;

import com.example.demo.entity.Staff;

public interface StaffService {

     void addStaff(Staff staff);
	
	 void deleteStaff(int id);
	
	 Staff getStaff(int id);
	
	
}
