package com.codestudio.corp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codestudio.corp.model.Personne;


public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
