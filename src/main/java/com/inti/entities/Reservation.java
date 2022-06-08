package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Reservation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateDebut;
	private Date dateFin;
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	@ManyToMany
	@JoinTable(name = "TrajetReserve", joinColumns = @JoinColumn(name = "id_resevation",referencedColumnName="idReservation"),inverseJoinColumns = @JoinColumn(name="id_trajet",referencedColumnName="idTrajet"))
	private Set<Trajet> trajets=new HashSet<>();
	
	
	public Reservation() {
	}

	public Reservation(Date dateDebut, Date dateFin) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(Set<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	
	
}
