package com.zohocrm01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm01.entites.Lead;
import com.zohocrm01.services.LeadServices;

@Controller
public class LeadController {
	@Autowired
	private LeadServices leadServices;

	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create_lead";
	}

	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute() Lead lead, Model model) {
		try {
			leadServices.saveLead(lead);
			model.addAttribute("lead", lead);
			return "view_lead";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
		return null;
	}

	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.findAll();
		model.addAttribute("leads", leads);
		return "listAll_Leads";
	}

	@RequestMapping("getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadServices.getLeadById(id);
		model.addAttribute("lead", lead);
		return "view_lead";
	}
}
