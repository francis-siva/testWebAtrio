package com.codestudio.corp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codestudio.corp.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
