package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankAccount;
import com.example.demo.service.BankService;



@RestController
@RequestMapping("bank")
public class BankAccountController {

	@Autowired
	BankService bankService;
	
	@PostMapping("add")
	public String addAccount(@RequestBody BankAccount bankAccount)
	{
		bankService.createAccount(bankAccount);
		return "Bank Account Created Successfully";
	}
	
	@GetMapping("/{id}")
	public BankService getAccount(@PathVariable int id)
	{	
			bankService.getAccount(id);
			return null;
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount(@PathVariable int id)
	{
		bankService.deleteAccount(id);
		return"Bank Account Deleted successfully";
	}
}
