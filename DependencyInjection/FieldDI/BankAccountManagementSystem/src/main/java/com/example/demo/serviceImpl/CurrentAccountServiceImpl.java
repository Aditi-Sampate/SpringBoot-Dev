package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BankAccountService;

@Service
public class CurrentAccountServiceImpl implements BankAccountService{

	@Override
	public String depositAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.CURRENT_DEPOSIT_AMOUNT;
	}

	@Override
	public String withdrawAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.CURRENT_WITHDRAW_AMOUNT;
	}

	@Override
	public String checkBalance() {
		// TODO Auto-generated method stub
		return MessageConstants.CURRENT_CHECK_BALANCE;
	}

}
