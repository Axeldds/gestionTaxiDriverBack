package com.inti.service.interfaces;

import java.util.Date;
import java.util.List;

import com.inti.entities.Reservation;

public interface IReservationService {
	
	List<Reservation> findAll();

	Reservation findOne(Long id);

	Reservation save(Reservation reservation);

	void delete(Long id);
	
	List<Reservation> findByDateDebut(Date dateDebut);
}
