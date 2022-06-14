package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Rapport;
import com.inti.repositories.RapportRepository;
import com.inti.service.interfaces.IRapportService;

@Service
public class RapportService implements IRapportService {
	@Autowired
	RapportRepository rapportRepository;

	@Override
	public List<Rapport> findAll() {
		return rapportRepository.findAll();
	}

	@Override
	public Rapport findOne(Long idRapport) {
		return rapportRepository.findById(idRapport).get();
	}

	@Override
	public Rapport save(Rapport rapport) {
		return rapportRepository.save(rapport);
	}

	@Override
	public void delete(Long idRapport) {
		rapportRepository.deleteById(idRapport);
	}

}
