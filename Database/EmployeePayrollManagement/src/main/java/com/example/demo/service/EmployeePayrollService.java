package com.example.demo.service;

import com.example.demo.entity.EmployeePayroll;

public interface EmployeePayrollService {

	void addEmployee(EmployeePayroll employeePayroll);
	
	void deleteEmployee(int id);
	
	EmployeePayroll getEmployee(int id);
}
