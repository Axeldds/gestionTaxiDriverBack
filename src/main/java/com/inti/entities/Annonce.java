package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Annonce implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnnonce;
	private Date dateAnnonce;
	@ManyToOne
	@JoinColumn(name="id_responsable_agence")
	private ResponsableAgence responsableAgence;
	
	public Annonce() {
	}
	
	public Annonce(Date dateAnnonce, ResponsableAgence responsableAgence) {
		this.dateAnnonce = dateAnnonce;
		this.responsableAgence = responsableAgence;
	}

	public Annonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
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

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", dateAnnonce=" + dateAnnonce + "]";
	}
	
	
}
