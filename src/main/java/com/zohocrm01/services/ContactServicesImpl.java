package com.zohocrm01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm01.Repositories.ContactRepository;
import com.zohocrm01.entites.Contact;

@Service
public class ContactServicesImpl implements ContactServices {
	@Autowired
	private ContactRepository contactRepo;// downcasting is happen

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);		
	}

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

	

}
