package com.zohocrm01.services;

import java.util.List;

import com.zohocrm01.entites.Contact;

public interface ContactServices {
public void saveContact(Contact contact);//here abstraction is done

public List<Contact> findAll();

public Contact getContactById(long id);

}
