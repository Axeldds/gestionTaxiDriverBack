package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Taxi;

public interface ITaxiService {
	
	List<Taxi> findAll();
	
	Taxi findOne(Long id);
	
	Taxi save(Taxi taxi);
	
	void delete (Long id);
	
	Taxi findByImmatriculation(String immatriculation);

}
