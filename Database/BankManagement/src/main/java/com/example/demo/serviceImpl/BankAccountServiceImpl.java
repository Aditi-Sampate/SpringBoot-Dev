package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankAccount;
import com.example.demo.repository.BankAccountRepository;
import com.example.demo.service.BankService;

@Service
public class BankAccountServiceImpl implements BankService{

	@Autowired
	BankAccountRepository bankAccountRepository;
	
	@Override
	public void createAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		bankAccountRepository.save(bankAccount);
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		bankAccountRepository.deleteById(id);
	}

	@Override
	public BankService getAccount(int id) {
		// TODO Auto-generated method stub
		bankAccountRepository.findById(id).get();
		return null;
	}

}
