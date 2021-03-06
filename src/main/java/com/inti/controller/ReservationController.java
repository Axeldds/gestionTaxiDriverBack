package com.inti.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Reservation;
import com.inti.service.interfaces.IReservationService;

@RestController
@CrossOrigin
public class ReservationController {
	@Autowired
	IReservationService reservationService;
	

	@GetMapping("/reservations") 
	public List<Reservation> findAll() {
		return reservationService.findAll();
		}
	
	@GetMapping("/reservations/{idReservation}") 
	public Reservation findOne(@PathVariable("idReservation") Long id) {
		return reservationService.findOne(id);
	}

	@PostMapping("/reservations") 
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);
	}

	@DeleteMapping("/reservations/{idReservation}") 
	public void deleteReservation(@PathVariable("idReservation") Long id) {
		reservationService.delete(id);
	}
	
	@PatchMapping("/reservations/{idReservation}")
	public Reservation updateReservationWithPatch(@PathVariable("idReservation") Long id,
			@RequestBody Reservation reservation) {
		Reservation currentUser = reservationService.findOne(id);
		currentUser.setDateDebut(reservation.getDateDebut());
		currentUser.setDateFin(reservation.getDateFin());
		return reservationService.save(currentUser);
	}
	@GetMapping("reservations/dateDebut/{dateDebut}")
	public List<Reservation> FindByDateDebut(@PathVariable("dateDebut")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDebut){
		return reservationService.findByDateDebut(dateDebut);
	}

}
