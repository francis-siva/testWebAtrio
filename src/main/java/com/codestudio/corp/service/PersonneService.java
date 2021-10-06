package com.codestudio.corp.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codestudio.corp.model.Personne;
import com.codestudio.corp.repository.PersonneRepository;

@Service
public class PersonneService {

	private final PersonneRepository personneRepository;
	
	private static boolean mockPersonneBuilt = false;
	
	@Autowired
	public PersonneService(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}
	
	public ArrayList<Personne> listPersonne() {
		
		/* Uncomment the following code lines to get some mock data by getMockPersonneList()
		feature in case hibernate.ddl-auto is not set up to update value. */
//		if(!PersonneService.mockPersonneBuilt) {
//			this.getMockPersonneList();
//			PersonneService.mockPersonneBuilt = true;
//		}
		
		return (ArrayList<Personne>) this.personneRepository.findAll(Sort.by(Sort.Direction.ASC, "nom"));
	}
	
	private ArrayList<Personne> getMockPersonneList() {
		//YYYY, M, D
		Personne pilot  = new Personne("Pilot", "Test", LocalDate.of(1994, 5, 6));
		Personne coder  = new Personne("De", "Codeur", LocalDate.of(2017, 9, 6));
		Personne james  = new Personne("Vagabond", "James", LocalDate.of(1984, 12, 17));
		Personne emma  = new Personne("Stodonte", "Emma", LocalDate.of(1988, 11, 6));
		Personne keira  = new Personne("Tines", "Keira", LocalDate.of(1985, 3, 26));
		Personne doyen  = new Personne("Intemporel", "Doyen", LocalDate.of(1872, 3, 26));
		
		ArrayList<Personne> mockPersonne = new ArrayList<Personne>();
		mockPersonne.add(pilot);
		mockPersonne.add(coder);
		mockPersonne.add(james);
		mockPersonne.add(emma);
		mockPersonne.add(keira);
		mockPersonne.add(doyen);
				
		for(Personne pers : mockPersonne) {
			System.out.println(pers.getPrenom());
			this.personneRepository.save(pers);
		}
		
		return mockPersonne;
	}
	
	//TODO in a proper way
	public void registerPersonne(Personne p) {
		//if(p.getNaissance() < 150 ) {}
		this.personneRepository.save(p);
	}
}
