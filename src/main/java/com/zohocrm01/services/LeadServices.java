package com.zohocrm01.services;

import java.util.List;

import com.zohocrm01.entites.Lead;

public interface LeadServices {
public void saveLead(Lead lead);//here abstraction is done

public List<Lead> findAll();

public Lead getLeadById(long id);

public void deleteById(long id);

}
