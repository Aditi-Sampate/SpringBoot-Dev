package com.example.demo.Service;

public class UPIPaymentServiceImpl implements PaymentService{

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		return "UPI payment of :" + amount + "processed successfully";
	}

}
