package com.cg.dao;

import org.springframework.stereotype.Component;

import com.cg.entity.Farmer;
import com.cg.entity.Users;



@Component("farmerDao")
public class FarmerDao  extends GenericDao{

	
	public Farmer getFarmer(Users user) {
		return (Farmer) entityManager.createQuery("select s from Farmer s where s.user=:id").setParameter("id", user).getSingleResult();
	}
	
}
