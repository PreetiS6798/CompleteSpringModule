package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Payment;
//import com.example.demo.layer2.PaymentNotFoundException;
import com.example.demo.layer2.Travel;

@Repository
public interface PaymentRepository {
	
	
	List<Payment> selectPaymentByInsuranceId(int paymentId);
	
	Payment insertPayment(Payment pay);
	List<Payment> getAllPayment();
	
	
}
