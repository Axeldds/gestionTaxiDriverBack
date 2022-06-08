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

import com.inti.entities.Avis;
import com.inti.entities.Trajet;
import com.inti.service.interfaces.IAvisService;
import com.inti.service.interfaces.ITrajetService;

@RestController
@CrossOrigin
public class TrajetController {

	@Autowired
	ITrajetService trajetService;

	@GetMapping("/trajets") 
	public List<Trajet> findAll() {
		return trajetService.findAll();
	}
	@GetMapping("/trajets/{idTrajets}")
	public Trajet findOne(@PathVariable("idTrajet") Long id) {
		return trajetService.findOne(id);
	}

	@PostMapping("/trajets") 
	public Trajet saveTrajet(@RequestBody Trajet trajet) {
		return trajetService.save(trajet);
	}

	@DeleteMapping("/trajets/{idTrajet}")
	public void deleteTrajet(@PathVariable("idTrajet") Long id) {
		trajetService.delete(id);
	}
	
}
