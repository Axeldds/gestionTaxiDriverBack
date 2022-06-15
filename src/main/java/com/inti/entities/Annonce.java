package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Annonce implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnnonce;
	private Date dateAnnonce;
	private float reduction;
	private String description;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_responsable_agence", referencedColumnName = "idResponsable")
	private ResponsableAgence responsableAgence;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_reservation", referencedColumnName = "idReservation")
	private Reservation reservation;

	public Annonce() {
	}

	public Annonce(Date dateAnnonce, ResponsableAgence responsableAgence) {
		this.dateAnnonce = dateAnnonce;
		this.responsableAgence = responsableAgence;
	}

	public Annonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
	}

	public Annonce(Date dateAnnonce, float reduction, String description, ResponsableAgence responsableAgence,
			Reservation reservation) {
		super();
		this.dateAnnonce = dateAnnonce;
		this.reduction = reduction;
		this.description = description;
		this.responsableAgence = responsableAgence;
		this.reservation = reservation;
	}

	public Annonce(Date dateAnnonce, float reduction, String description) {
		this.dateAnnonce = dateAnnonce;
		this.reduction = reduction;
		this.description = description;
	}

	public Long getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Long idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Date getDateAnnonce() {
		return dateAnnonce;
	}

	public void setDateAnnonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
	}

	public ResponsableAgence getResponsableAgence() {
		return responsableAgence;
	}

	public void setResponsableAgence(ResponsableAgence responsableAgence) {
		this.responsableAgence = responsableAgence;
	}

	public float getReduction() {
		return reduction;
	}

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", dateAnnonce=" + dateAnnonce + ", reduction=" + reduction
				+ ", description=" + description + ", responsableAgence=" + responsableAgence + ", reservation="
				+ reservation + "]";
	}

}
