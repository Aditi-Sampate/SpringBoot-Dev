package com.example.demo.Service;

public class NetBankingPaymentServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		return "NetBanking Amount of :" + amount + "processed successfully";
	}

}
