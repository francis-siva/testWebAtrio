package com.codestudio.corp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public class PersonneController {
	
	@GetMapping("/")
	public String Welcome() {
		return "welcome";
	}
	
	
	@PostMapping("/register")
	public void register() {
		
	}
}
