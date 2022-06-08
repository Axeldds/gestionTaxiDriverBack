package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	Utilisateur findByUsername(String username);
	List<Utilisateur> findByNomUtilisateur(String nomUtilisateur);

}
