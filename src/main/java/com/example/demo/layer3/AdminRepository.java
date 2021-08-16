package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Claim;

public interface AdminRepository {

	public List<Claim> selectAllClaims();
	void updateStatus(Claim claim);
}
