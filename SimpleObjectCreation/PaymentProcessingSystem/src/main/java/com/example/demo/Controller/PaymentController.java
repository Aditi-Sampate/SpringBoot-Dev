package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CreditCardPaymentServiceImpl;
import com.example.demo.Service.NetBankingPaymentServiceImpl;
import com.example.demo.Service.PaymentService;
import com.example.demo.Service.UPIPaymentServiceImpl;


@RestController
public class PaymentController {

	
	@GetMapping("/pay/{amount}/{mode}")
	public String makePayment(@PathVariable String mode,@PathVariable double amount) 
	{
		
		PaymentService ps = null;
		
		if(mode.equals("card")) {
			ps = new CreditCardPaymentServiceImpl();
			
	
		}
		if(mode.equals("upi"))
		{
			ps = new UPIPaymentServiceImpl();
			
		}
		if(mode.equals("net"))
		{
			ps = new NetBankingPaymentServiceImpl();
		}
		
		return ps.processPayment(amount);
		
		
	}
}
