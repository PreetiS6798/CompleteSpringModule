package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Claim;
import com.example.demo.layer2.Insurance;
import com.example.demo.layer3.AdminRepositoryImpl;
import com.example.demo.layer3.ClaimRepositoryImpl;
import com.example.demo.layer3.InsuranceRepositoryImpl;



@Service
public class AdminServiceImpl implements AdminService {
	
	public AdminServiceImpl() {
		System.out.println("In layer 4");
	}
	

	@Autowired
	AdminRepositoryImpl admRepo;

   @Override
	public List<Claim> selectAllClaimService() {
		System.out.println("AdminServiceImpl: Layer 4 ");
		return admRepo.selectAllClaims();
	}

}