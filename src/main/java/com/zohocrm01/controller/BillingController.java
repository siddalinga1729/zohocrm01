package com.zohocrm01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm01.entites.Billing;
import com.zohocrm01.services.BillingServices;

@Controller
public class BillingController {
@Autowired
private BillingServices billingServices;
	
	@RequestMapping("savebill")
	public String savebill(@ModelAttribute() Billing billing,ModelMap model) {
		billingServices.generateOneBill(billing);
		model.addAttribute("billing", billing);
		return "bill_details";
	}
}
