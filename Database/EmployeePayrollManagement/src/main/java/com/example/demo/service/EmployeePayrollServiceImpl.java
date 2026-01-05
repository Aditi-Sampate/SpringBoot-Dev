package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeePayroll;
import com.example.demo.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService{

	@Autowired
	EmployeePayrollRepository employeePayrollRepository;
	
	@Override
	public void addEmployee(EmployeePayroll employeePayroll) {
		// TODO Auto-generated method stub
		employeePayrollRepository.save(employeePayroll);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeePayrollRepository.deleteById(id);
		
	}

	@Override
	public EmployeePayroll getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeePayrollRepository.findById(id).get();
	}

}
