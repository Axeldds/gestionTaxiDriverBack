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

import com.inti.entities.Rapport;
import com.inti.service.interfaces.IRapportService;

@RestController
@CrossOrigin
public class RapportController {

	@Autowired
	IRapportService rapportService;

	@GetMapping("/rapports")
	public List<Rapport> findAll() {
		return rapportService.findAll();
	}

	@GetMapping("/rapports/{idRapport}")
	public Rapport findOne(@PathVariable("idRapport") Long id) {
		return rapportService.findOne(id);
	}

	@PostMapping("/rapports")
	public Rapport saveRapport(@RequestBody Rapport rapport) {
		return rapportService.save(rapport);
	}

	@DeleteMapping("/rapports/{idRapport}")
	public void deleteRapport(@PathVariable("idRapport") Long id) {
		rapportService.delete(id);
	}

}