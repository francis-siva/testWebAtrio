package com.codestudio.corp.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codestudio.corp.model.Personne;
import com.codestudio.corp.repository.PersonneRepository;

@Service
public class PersonneService {

	private final PersonneRepository personneRepository;
	
	@Autowired
	public PersonneService(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}
	
	public ArrayList<Personne> listPersonne() {
		ArrayList<Personne> listPers = new ArrayList<Personne>();
				
		//YYYY, M, D
		Personne p  = new Personne("test", "azerty", LocalDate.of(1994, 5, 6));
		
		listPers.add(p);
		LocalDate date2 = LocalDate.of(2020, 1, 8);System.out.println("date2 " + date2);
		System.out.println("getNaissance() " + p.getNaissance());

		LocalDate date = LocalDate.parse("2021-10-02");System.out.println(date);
		//this.personneRepository.findAll(Sort.by(Sort.Direction.ASC, "nom"));
		return new ArrayList<Personne>(this.personneRepository.findAll()); //this.personneRepository.findAll()
		//return listPers;
	}
	
	//TODO in a proper way
	public void registerPersonne(Personne p) {
		//if(p.getNaissance() < 150 ) {}
		this.personneRepository.save(p);
	}
}
