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

import com.inti.entities.Administrateur;
import com.inti.service.interfaces.IAdministrateurService;

@RestController
@CrossOrigin
public class AdministrateurController {
	@Autowired
	IAdministrateurService administrateurService;
	
	@GetMapping("/administrateurs") 
	public List<Administrateur> findAll() {
		return administrateurService.findAll();
		}
	
	@GetMapping("/administrateurs/{idAdministrateur}") 
	public Administrateur findOne(@PathVariable("idAdministrateur") Long id) {
		return administrateurService.findOne(id);
	}

	@PostMapping("/administrateurs") 
	public Administrateur saveAdministrateur(@RequestBody Administrateur administrateur) {
		return administrateurService.save(administrateur);
	}

	@DeleteMapping("/administrateurs/{idAdministrateur}") 
	public void deleteAdministrateur(@PathVariable("idAdministrateur") Long id) {
		administrateurService.delete(id);
	}
	
	/*@PatchMapping("/administrateurs/{idAdministrateur}")
	public Administrateur updateAdministrateurWithPatch(@PathVariable("idAdministrateur") Long id,
			@RequestBody Administrateur administrateur) {
		Administrateur currentUser = administrateurService.findOne(id);
		currentUser.setPassword(administrateur.getPassword());
		return administrateurService.save(currentUser);
	}*/

}
