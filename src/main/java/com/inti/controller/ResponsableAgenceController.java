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

import com.inti.entities.ResponsableAgence;
import com.inti.service.interfaces.IResponsableAgenceService;

@RestController
@CrossOrigin
public class ResponsableAgenceController {
	
	@Autowired
	IResponsableAgenceService responsableAgenceService;

	@GetMapping("/responsableAgences") 
	public List<ResponsableAgence> findAll() {
		return responsableAgenceService.findAll();
		}
	
	@GetMapping("/responsableAgences/{idResponsableAgence}") 
	public ResponsableAgence findOne(@PathVariable("idResponsable") Long id) {
		return responsableAgenceService.findOne(id);
	}

	@PostMapping("/responsableAgences") 
	public ResponsableAgence saveResponsableAgence(@RequestBody ResponsableAgence responsableAgence) {
		return responsableAgenceService.save(responsableAgence);
	}

	@DeleteMapping("/responsableAgences/{idResponsableAgence}") 
	public void deleteResponsableAgence(@PathVariable("idResponsable") Long id) {
		responsableAgenceService.delete(id);
	}
}
