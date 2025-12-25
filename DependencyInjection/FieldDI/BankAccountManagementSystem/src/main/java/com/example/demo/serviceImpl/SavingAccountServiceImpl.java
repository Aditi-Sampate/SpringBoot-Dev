package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.BankAccountService;

@Service
@Primary
public class SavingAccountServiceImpl implements BankAccountService{

	@Override
	public String depositAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.SAVING_DEPOSIT_AMOUNT;
	}

	@Override
	public String withdrawAmount() {
		// TODO Auto-generated method stub
		return MessageConstants.SAVING_WIHTDRAW_AMOUNT;
	}

	@Override
	public String checkBalance() {
		// TODO Auto-generated method stub
		return MessageConstants.SAVING_CHECK_BALANCE;
	}

}
