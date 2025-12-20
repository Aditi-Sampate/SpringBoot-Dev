package com.example.demo.Service;

public class CreditCardPaymentServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		return "Credit Card Payment of :"+amount + "processed successfully";
	}

	
}
