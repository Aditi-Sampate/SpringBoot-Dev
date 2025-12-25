package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BankAccountService;
import com.example.demo.serviceImpl.CurrentAccountServiceImpl;
import com.example.demo.serviceImpl.SalaryAccountServiceImpl;
import com.example.demo.serviceImpl.SavingAccountServiceImpl;

@RestController
@RequestMapping("bank")
public class BankAccountController {

	
	@Autowired
	CurrentAccountServiceImpl currentAccountService;
	
	@Autowired
	SalaryAccountServiceImpl salaryAccountService;
	
	@Autowired
	SavingAccountServiceImpl savingAccountService;
	
	@Autowired
	BankAccountService bankAccountService;
	
	
	
	@GetMapping("/{type}")
	public String depositeAmount(@PathVariable String type)
	{
		switch (type) 
		{
		
			case "current": 
				bankAccountService = currentAccountService;
				break;
				
			case "saving":
				bankAccountService = savingAccountService;
				break;
				
			case "salary":
				bankAccountService = salaryAccountService;
				break;
				
			default:
				return "invalid Account Type";
		}
		
		return bankAccountService.depositAmount() +"-------->" + bankAccountService.withdrawAmount()+"-------->"+bankAccountService.checkBalance();        
	}
}
