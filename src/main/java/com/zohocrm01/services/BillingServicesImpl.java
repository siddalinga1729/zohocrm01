package com.zohocrm01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm01.Repositories.BillingRepository;
import com.zohocrm01.entites.Billing;
@Service
public class BillingServicesImpl implements BillingServices {

	@Autowired
	private BillingRepository billingRepo;
	@Override
	public void generateOneBill(Billing bill) {
		billingRepo.save(bill);
	}

}
