package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Administrateur;

public interface IAdministrateurService {
	
	List<Administrateur> findAll();
	
	Administrateur findOne(Long id);
	
	Administrateur save(Administrateur administrateur);
	
	void delete (Long id);

}
