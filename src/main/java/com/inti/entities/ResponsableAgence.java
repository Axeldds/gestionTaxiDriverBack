package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class ResponsableAgence {
	
	private Long idResponsable;
	private String nomResponsable;
	private String prenomResponsable;
	
	public ResponsableAgence() {
		
	}

	public ResponsableAgence(String nomResponsable, String prenomResponsable) {
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
	}

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public String getPrenomResponsable() {
		return prenomResponsable;
	}

	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}
	
	
	
	
}
