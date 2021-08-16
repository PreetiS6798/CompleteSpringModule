package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Payment;
import com.example.demo.layer3.PaymentRepositoryImpl;
import com.example.demo.layer4.PaymentServiceImpl;

@SpringBootTest
public class PaymentApplicationTest {
	
	@Autowired
	private PaymentRepositoryImpl payRepo;
	
	@Autowired
	PaymentServiceImpl service;
	
	@Test
	public void insertPaymentTest() {
		Insurance insurance = new Insurance(305);
		System.out.println("Adding  a payment...");
		Payment payment = new Payment(4500,insurance);
		payRepo.insertPayment(payment);	
	}
	
	
	@Test
	public void deletePaymentTest() {
        
        payRepo.deletePayment(87);
	}
	
	@Test
	void updatePayment()
	{
		System.out.println("Updating payment...");
		int paymentId=701;
		payRepo.updatePayment(paymentId);
		System.out.println("Payment Updated...");
		
	}
	
	@Test
	void selectPaymentBasedOnBetweenAmounts()
	{
		System.out.println("Fetching payment...");
		
		List<Payment> paymentList=payRepo.selectPaymentBasedOnAmountInRange(1000,2500);
		for (Payment payment : paymentList) {
			System.out.println("PaymentId : "+payment.getPaymentId());
			System.out.println("PaymentAmount : "+payment.getPaymentAmount());
		}
	}
	
	@Test
	void loadAllPaymentTest() {
		System.out.println("Loading all the students...");
		List<Payment> paymentList = payRepo.getAllPayment();
		System.out.println("paymentList "+paymentList.size());
		for (Payment payment : paymentList) {
			System.out.println("PaymentId : "+payment.getPaymentId());
			System.out.println("PaymentAmount : "+payment.getPaymentAmount());
		}
	}
	
	
}
