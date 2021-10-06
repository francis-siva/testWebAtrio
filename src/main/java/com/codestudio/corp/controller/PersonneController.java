package com.codestudio.corp.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codestudio.corp.exception.InvalidPersonneException;
import com.codestudio.corp.model.Personne;
import com.codestudio.corp.service.PersonneService;

@Controller
public class PersonneController {
	
	private final PersonneService personneService;
	
	@Autowired
	public PersonneController(PersonneService personneService) {
		this.personneService = personneService;
	}
	
	@GetMapping(value = "/")
	public String welcome(Model model) {System.out.println("Main Page");
	
		model.addAttribute("personne", new Personne());
		return "welcome";
	}
	
	
	@PostMapping(value = "/register")
	public String register(@ModelAttribute Personne p, @RequestParam("birth") String birth, ModelMap map) {
				
		System.out.println("birth: " + birth);
		String[] datePart = birth.split("-");

		if(datePart.length == 3) {
			System.out.println(datePart[0] + "/" + datePart[1] + "/" + datePart[2]);

			try {
				int year = Integer.parseInt(datePart[0]);
				int month = Integer.parseInt(datePart[1]);
				int day = Integer.parseInt(datePart[2]);
				
				//Date de naissance à jour de Personne p
				p.setNaissance(LocalDate.of(year, month, day));
				
				
				Period period = Period.between(p.getNaissance(), LocalDate.now());
				//Gap of Years between period
				System.out.println("Gap of Years between period [=] " + period.getYears());
				
				if(period.getYears() >= 150) {
					throw new InvalidPersonneException("Erreur: Enregistrement impossible la Personne doit avoir moins de 150 ans !");
				}
				
				this.personneService.registerPersonne(p);
				System.out.println(p.toString());
				System.out.println(p.getNom() + " est enregistré en base.");
				map.addAttribute("personne", p);
			}
			catch(NumberFormatException e) {
				System.err.println("Erreur: Format de la date incorrect !");
				System.err.println(e.getMessage());
				map.addAttribute("ErrorOnDateFormat", e.getMessage());
			}
			catch(InvalidPersonneException e) {
				System.err.println(e.getMessage());
				map.addAttribute("ErrorOnDateLimit",  e.getMessage());
			}
						
		}
			
		return "user";		
	}
	
	@GetMapping(value= "/listperson")
	public String getListPerson(ModelMap map) {
		
		System.out.println("member");
		
		for(Personne pers : this.personneService.listPersonne()) {
			
			System.out.println(">>>Nom: " + pers.getNom() + " Prenom: " +
				pers.getPrenom() + " Naissance: " + pers.getNaissance());
		}
		ArrayList<Personne> listperson = this.personneService.listPersonne();
		System.out.println("Before JSP View");
		System.out.println(listperson);
		map.addAttribute("listperson", listperson);
		
		return "memberlist";
	}
}
