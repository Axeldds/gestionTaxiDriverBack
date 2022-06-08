package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Agence;

public interface IAgenceService {
	List<Agence> findAll();

	Agence findOne(Long id);

	Agence save(Agence agence);

	void delete(Long id);
	
	Agence findByIdAgence(Long idAgence);
}
