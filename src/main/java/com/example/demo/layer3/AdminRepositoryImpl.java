package com.example.demo.layer3;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.Claim;
import com.example.demo.layer2.Insurance;
import com.example.demo.layer2.Vehicle;



@Repository
public class AdminRepositoryImpl extends BaseRepository implements AdminRepository {


@Transactional
	public List<Claim> selectAllClaims(){
		EntityManager entityManager = getEntityManager();
		System.out.println("debug selectAllClaims ");
		
		Query query = entityManager.createQuery("from Claim where CLAIM_APPROVALSTATUS=:status");

		
		query.setParameter("status", 0);
		
		//query.setParameter("cid", insuranceId);
		List<Claim> admList = query.getResultList();
		return admList;
	}


}