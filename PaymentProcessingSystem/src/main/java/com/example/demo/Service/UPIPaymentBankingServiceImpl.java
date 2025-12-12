package com.example.demo.Service;

public class UPIPaymentBankingServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI payment processed successfully");
		return "UPI Payment"+amount +"processed successfully";
	}

}
