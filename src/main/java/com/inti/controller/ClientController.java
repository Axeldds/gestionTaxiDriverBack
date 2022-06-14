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

import com.inti.entities.Client;
import com.inti.service.interfaces.IClientService;

@RestController
@CrossOrigin
public class ClientController {

	@Autowired
	IClientService clientService;

	@GetMapping("/clients")
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@GetMapping("/clients/{idClient}")
	public Client findOne(@PathVariable("idClient") Long id) {
		return clientService.findOne(id);
	}

	@PostMapping("/clients")
	public Client saveClient(@RequestBody Client client) {
		return clientService.save(client);
	}

	@DeleteMapping("/clients/{idClient}")
	public void deleteClient(@PathVariable("idClient") Long id) {
		clientService.delete(id);
	}

	@PatchMapping("/clients/{idClient}")
	public Client updateClientWithPatch(@PathVariable("idClient") Long id, @RequestBody Client client) {
		Client currentUser = clientService.findOne(id);
		currentUser.setAge(client.getAge());
		return clientService.save(currentUser);
	}
}
