package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.AuthenticationService;

@Service
@Primary
public class OTPAuthServiceImpl implements AuthenticationService{

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_LOGIN;
	}

	@Override
	public String logOut() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_LOGOUT;
	}

	@Override
	public String ValidateUser() {
		// TODO Auto-generated method stub
		return MessageConstants.OTP_VALIDATE;
	}

}
