package com.example.demo.Service;

public class CreditCardPaymentServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment processed successfully");
		return "Credit Card Payment of :"+ amount +"Processed Successfully";
	}

}
