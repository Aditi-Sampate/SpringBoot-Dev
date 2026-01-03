package com.example.demo.service;

import com.example.demo.entity.BankAccount;

public interface BankService {

	void createAccount(BankAccount bankAccount);
	
	void deleteAccount(int id);
	
	BankService getAccount(int id);
	
}
