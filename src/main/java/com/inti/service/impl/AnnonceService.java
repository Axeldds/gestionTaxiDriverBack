package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Annonce;
import com.inti.repositories.AnnonceRepository;
import com.inti.service.interfaces.IAnnonceService;

@Service
public class AnnonceService implements IAnnonceService {

	@Autowired
	AnnonceRepository annonceRepository;

	@Override
	public List<Annonce> findAll() {
		return annonceRepository.findAll();
	}

	@Override
	public Annonce findOne(Long id) {
		return annonceRepository.findById(id).get();
	}

	@Override
	public Annonce save(Annonce annonce) {
		return annonceRepository.save(annonce);
	}

	@Override
	public void delete(Long id) {
		annonceRepository.deleteById(id);

	}
}
