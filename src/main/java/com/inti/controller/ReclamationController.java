package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Reclamation;
import com.inti.entities.Trajet;
import com.inti.service.interfaces.IReclamationService;
import com.inti.service.interfaces.ITrajetService;

@RestController
@CrossOrigin
public class ReclamationController {

	
	@Autowired
	IReclamationService reclamationService;

	@GetMapping("/reclamations") 
	public List<Reclamation> findAll() {
		return reclamationService.findAll();
	}
	@GetMapping("/reclamations/{idReclamation}")
	public Reclamation findOne(@PathVariable("idReclamation") Long id) {
		return reclamationService.findOne(id);
	}

	@PostMapping("/reclamations") 
	public Reclamation saveReclamation(@RequestBody Reclamation reclamation) {
		return reclamationService.save(reclamation);
	}

	@DeleteMapping("/reclamations/{idReclamation}")
	public void deleteReclamation(@PathVariable("idReclamation") Long id) {
		reclamationService.delete(id);
	}
}
