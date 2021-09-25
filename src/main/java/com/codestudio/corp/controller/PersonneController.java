package com.codestudio.corp.controller;

import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


public class PersonneController {
	
	@GetMapping("/")
	public String Welcome() {
		return "welcome";
	}
	
	
	@PostMapping("/register")
	public void register(Model model) {
		String prenom = (String) model.getAttribute("prenom");
		String nom = (String) model.getAttribute("nom");
		Date birth = (Date) model.getAttribute("birth");
		
		//Create person by autowired object instead of Person's instance
	}
}
