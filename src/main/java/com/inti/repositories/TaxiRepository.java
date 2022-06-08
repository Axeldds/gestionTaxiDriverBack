package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Taxi;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Long>{
	
	Taxi findByIdTaxi(Long id);
	
	List<Taxi> findByImmatriculation(String immatriculation);

}
