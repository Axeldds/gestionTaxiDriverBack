package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Chauffeur;

public interface IChauffeurService {
	List<Chauffeur> findAll();

	Chauffeur findOne(Long id);

	Chauffeur save(Chauffeur chauffeur);

	void delete(Long id);

	List<Chauffeur> findByNomChauffeur(String nomChauffeur);

	List<Chauffeur> findByPrenomChauffeur(String prenomChauffeur);

}
