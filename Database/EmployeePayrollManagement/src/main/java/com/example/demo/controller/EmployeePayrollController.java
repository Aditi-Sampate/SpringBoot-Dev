package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeePayroll;
import com.example.demo.service.EmployeePayrollService;

@RestController
@RequestMapping("employee")
public class EmployeePayrollController {

	@Autowired
	EmployeePayrollService employeePayrollService;
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody EmployeePayroll employeePayroll)
	{
		employeePayrollService.addEmployee(employeePayroll);
		return "Employee is Added in Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		employeePayrollService.deleteEmployee(id);
		return "Employee is Deleted From Database";
	}
	
	@GetMapping("/{id}")
   EmployeePayroll getEmployee(@PathVariable int id)
   {
	   return employeePayrollService.getEmployee(id);
   }
	
}
