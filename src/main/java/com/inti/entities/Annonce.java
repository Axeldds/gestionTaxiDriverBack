package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Annonce {

	private Long idAnnonce;
	private Date dateAnnonce;

	public Annonce() {

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
	
}
