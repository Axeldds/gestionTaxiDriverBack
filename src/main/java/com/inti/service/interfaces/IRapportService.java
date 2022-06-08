package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Rapport;

public interface IRapportService {
	List<Rapport> findAll();

	Rapport findOne(Long idRapport);

	Rapport save(Rapport rapport);

	void delete(Long idRapport);
}