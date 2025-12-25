package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.AuthenticationService;

@Service
public class UsernamePassAuthServiceImpl implements AuthenticationService{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_LOGIN;
	}

	@Override
	public String logOut() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_LOGOUT;
	}

	@Override
	public String ValidateUser() {
		// TODO Auto-generated method stub
		return MessageConstants.USER_PASS_VALIDATE;
	}

}
