package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Claim;
import com.example.demo.layer2.Insurance;
import com.example.demo.layer4.AdminServiceImpl;
import com.example.demo.layer4.ClaimServiceImpl;
import com.example.demo.layer4.InsuranceServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminJPAController {
	
	public AdminJPAController() {
		System.out.println("In Layer 5");
	}

	
	@Autowired
	AdminServiceImpl admService;


	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getAllClaim")
	public List<Claim> getAllClaims(){
		System.out.println("in getAllClaims() ... method");
		return admService.selectAllClaimService();
	}

}