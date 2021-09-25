package com.codestudio.corp.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class PersonneController {
	
	@GetMapping("/")
	public String Welcome() {
		return "welcome";
	}
	
}
