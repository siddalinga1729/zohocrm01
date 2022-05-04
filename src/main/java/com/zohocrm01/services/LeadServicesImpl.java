package com.zohocrm01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm01.Repositories.LeadRepository;
import com.zohocrm01.entites.Lead;
@Service
public class LeadServicesImpl implements LeadServices {
@Autowired
private LeadRepository leadRepo;//downcasting is happen
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> findAll() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public Lead getLeadById(long id) {
		Lead lead = leadRepo.getById(id);
		return lead;
	}
	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}
	

}
