package com.zohocrm01.services;

import org.springframework.stereotype.Service;

import com.zohocrm01.entites.Billing;

@Service
public interface BillingServices {
	public void generateOneBill(Billing bill);
}
