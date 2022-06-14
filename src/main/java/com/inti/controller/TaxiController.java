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

import com.inti.entities.Taxi;
import com.inti.service.interfaces.ITaxiService;

@RestController
@CrossOrigin
public class TaxiController {
	@Autowired
	ITaxiService taxiService;
	
	@GetMapping("/taxis") 
	public List<Taxi> findAll() {
		return taxiService.findAll();
		}
	
	@GetMapping("/taxis/{idTaxi}") 
	public Taxi findOne(@PathVariable("idTaxi") Long id) {
		return taxiService.findOne(id);
	}

	@PostMapping("/taxis") 
	public Taxi saveTaxi(@RequestBody Taxi taxi) {
		return taxiService.save(taxi);
	}

	@DeleteMapping("/taxis/{idTaxi}") 
	public void deleteTaxi(@PathVariable("idTaxi") Long id) {
		taxiService.delete(id);
	}
	
	@PatchMapping("/taxis/{idTaxi}")
	public Taxi updateTaxiWithPatch(@PathVariable("idTaxi") Long id,
			@RequestBody Taxi taxi) {
		Taxi currentUser = taxiService.findOne(id);
		currentUser.setKilometrage(taxi.getKilometrage());
		return taxiService.save(currentUser);
	}

}
