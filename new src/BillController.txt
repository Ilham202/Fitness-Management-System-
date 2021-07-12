package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Order;
import com.service.BillService;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@Controller
public class BillController {
	@Autowired
	private BillService billService;
	@RequestMapping(value="/showPage" ,method=RequestMethod.GET)
	public String showPage(@ModelAttribute("order") Order order) {
		return"showpage";
	}
	@RequestMapping(value="/billDesk" ,method=RequestMethod.POST)
	public String calculateTotalCost(@Valid@ModelAttribute("order") Order order, 
			BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			return "showpage";
		}
		double totalCost=billService.calculateTotalCost(order);
		model.addAttribute("totalCost",totalCost);
		return "billdesk";
	}
	
	@ModelAttribute("brandList")
	public List<String> populateBrandName(){
		List<String> l=new ArrayList<>();
		l.add("LG");
		l.add("MI");
		l.add("Samsung");
		l.add("Sony");
		l.add("Micromax");
		return l;
		
	}
	@ModelAttribute("displayList")
	public List<String> populateDisplayType(){
		List<String> l1=new ArrayList<>();
		l1.add("QLED");
		l1.add("OLED");
		l1.add("LED");
		l1.add("LCD");
		l1.add("Plasma");
		return l1;
		
	}

}
