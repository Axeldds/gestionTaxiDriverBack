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

import com.inti.entities.Agence;
import com.inti.service.interfaces.IAgenceService;

@RestController
@CrossOrigin
public class AgenceController {
	@Autowired
	IAgenceService agenceService;

	@GetMapping("/agences") 
	public List<Agence> findAll() {
		return agenceService.findAll();
		}
	
	@GetMapping("/agences/{idAgence}") 
	public Agence findOne(@PathVariable("idAgence") Long id) {
		return agenceService.findOne(id);
	}

	@PostMapping("/agences") 
	public Agence saveAgence(@RequestBody Agence agence) {
		return agenceService.save(agence);
	}

	@DeleteMapping("/agences/{idAgence}") 
	public void deleteAgence(@PathVariable("idAgence") Long id) {
		agenceService.delete(id);
	}
	
	@PatchMapping("/agence/{idAgence}")
	public Agence updateAgenceWithPatch(@PathVariable("idAgence") Long id,
			@RequestBody Agence agence) {
		Agence currentUser = agenceService.findOne(id);
		currentUser.setChiffreAffaire(agence.getChiffreAffaire());
		return agenceService.save(currentUser);
	}
}
