package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Chauffeur;
import com.inti.service.interfaces.IChauffeurService;

@RestController
@CrossOrigin
public class ChauffeurController {
	@Autowired
	IChauffeurService chauffeurService;
	
	@GetMapping("/chauffeurs") 
	public List<Chauffeur> findAll() {
		return chauffeurService.findAll();
		}
	
	@GetMapping("/chauffeurs/{idChauffeur}") 
	public Chauffeur findOne(@PathVariable("idChauffeur") Long id) {
		return chauffeurService.findOne(id);
	}

	@PostMapping("/chauffeurs") 
	public Chauffeur saveChauffeur(@RequestBody Chauffeur chauffeur) {
		return chauffeurService.save(chauffeur);
	}

	@DeleteMapping("/chauffeurs/{idChauffeur}") 
	public void deleteChauffeur(@PathVariable("idChauffeur") Long id) {
		chauffeurService.delete(id);
	}
	
	@PatchMapping("/chauffeurs/{idChauffeur}")
	public Chauffeur updateChauffeurWithPatch(@PathVariable("idChauffeur") Long id,
			@RequestBody Chauffeur chauffeur) {
		Chauffeur currentUser = chauffeurService.findOne(id);
		currentUser.setTaxi(chauffeur.getTaxi());
		return chauffeurService.save(currentUser);
	}

}
