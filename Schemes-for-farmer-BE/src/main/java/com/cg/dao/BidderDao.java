package com.cg.dao;

import org.springframework.stereotype.Component;

import com.cg.entity.Bidder;
import com.cg.entity.Farmer;
import com.cg.entity.Users;

@Component("bidderDao")
public class BidderDao extends GenericDao {

	
	public Bidder getFarmer(Users user) {
		return (Bidder) entityManager.createQuery("select s from Bidder s where s.user=:id").setParameter("id", user).getSingleResult();
	}
}
