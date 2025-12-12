package com.example.demo.Service;

public class NetBankingPaymentServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Net Banking payment successfully");
		return "Net Banking Payment of :"+ amount+ "processed successfully";
	}

}
