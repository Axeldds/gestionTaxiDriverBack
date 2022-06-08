package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Administrateur;
import com.inti.repositories.AdministrateurRepository;
import com.inti.service.interfaces.IAdministrateurService;

@Service
public class AdministrateurService implements IAdministrateurService{
	@Autowired
	AdministrateurRepository administrateurRepository;

	@Override
	public List<Administrateur> findAll() {
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur findOne(Long id) {
		return administrateurRepository.findById(id).get();
	}

	@Override
	public Administrateur save(Administrateur administrateur) {
		return administrateurRepository.save(administrateur);
	}

	@Override
	public void delete(Long id) {
		administrateurRepository.deleteById(id);		
	}

}
