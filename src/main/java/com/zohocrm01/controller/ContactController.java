package com.zohocrm01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm01.entites.Contact;
import com.zohocrm01.entites.Lead;
import com.zohocrm01.services.ContactServices;
import com.zohocrm01.services.LeadServices;

@Controller
public class ContactController {
	@Autowired
	private LeadServices leadServices;
	@Autowired
	private ContactServices contactServices;
	@RequestMapping("convert")
	public String convertContact(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadServices.getLeadById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactServices.saveContact(contact);
		leadServices.deleteById(id);
		List<Contact> contacts = contactServices.findAll();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
	@RequestMapping("leadContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactServices.findAll();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
	@ExceptionHandler
	@RequestMapping("getcontactById")
	public String getcontactById(@RequestParam("id")long id,ModelMap model) {
		Contact contact = contactServices.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
}
