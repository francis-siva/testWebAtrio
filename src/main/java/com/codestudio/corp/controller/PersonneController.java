package com.codestudio.corp.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonneController {
	
	@GetMapping(value = "/")
	public String welcome() {System.out.println("Main Page");
		return "welcome";
	}
	
	
	@PostMapping(value = "/register")//("/welcome")
	public String register(Model model) {
		String prenom = (String) model.getAttribute("prenom");
		String nom = (String) model.getAttribute("nom");
		Date birth = (Date) model.getAttribute("birth");
		
		System.out.println(model);
		System.out.println("prenom: " + prenom + " nom: " + nom + " birth: " + birth);
		
		//Create person by autowired object instead of Person's instance
		return "user";
		
	}
}
