package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long>{
	Annonce findByIdAnnonce(Long idAnnonce);
}
