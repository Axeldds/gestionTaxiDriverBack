package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.ResponsableAgence;
import com.inti.repositories.ResponsableAgenceRepository;
import com.inti.service.interfaces.IResponsableAgenceService;

@Service
public class ResponsableAgenceService implements IResponsableAgenceService {

	@Autowired
	ResponsableAgenceRepository responsableAgenceRepository;

	@Override
	public List<ResponsableAgence> findAll() {
		return responsableAgenceRepository.findAll();
	}

	@Override
	public ResponsableAgence findOne(Long id) {
		return responsableAgenceRepository.findById(id).get();
	}

	@Override
	public ResponsableAgence save(ResponsableAgence responsableAgence) {
		return responsableAgenceRepository.save(responsableAgence);
	}

	@Override
	public void delete(Long id) {
		responsableAgenceRepository.deleteById(id);

	}

}
