//Constructor Dependency Injection

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthenticationService;
import com.example.demo.serviceImpl.OTPAuthServiceImpl;
import com.example.demo.serviceImpl.ThirdPartyAuthServiceImpl;
import com.example.demo.serviceImpl.UsernamePassAuthServiceImpl;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

	@Autowired
	OTPAuthServiceImpl otpAuthService;
	
	@Autowired
	ThirdPartyAuthServiceImpl thirdPartyAuthService;
	
	@Autowired
	UsernamePassAuthServiceImpl usernamePassAuthservice;
	
	@Autowired
	AuthenticationService authService;
	
	
	@GetMapping("/{type}")
	public String AuthenticationSystem(@PathVariable String type)
	{
	
		switch(type)
		{
			case "otp":
				authService = otpAuthService;
				break;
			
			case "thirdparty":
				authService = thirdPartyAuthService;
				break;
		
			case "username&pass":
				authService = usernamePassAuthservice;
				break;
				
			default:
				return "invalid";
				
		}
		
		
		return authService.login() +"------->"+authService.logOut() +"------->"+ authService.ValidateUser();

	}
	
}