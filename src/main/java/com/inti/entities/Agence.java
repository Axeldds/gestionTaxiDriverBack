package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Agence {

	private Long idAgence;
	private String nomAgence;
	private String adresse;
	private float chiffreAffaire;

	public Agence() {

	}

	public Agence(String nomAgence, String adresse, float chiffreAffaire) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.chiffreAffaire = chiffreAffaire;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(float chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

}
