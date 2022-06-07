package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdministrateur;
	private String nomAdministrateur;
	private String prenomAdministrateur;

	public Administrateur() {

	}

	public Administrateur(String nomAdministrateur, String prenomAdministrateur) {
		this.nomAdministrateur = nomAdministrateur;
		this.prenomAdministrateur = prenomAdministrateur;
	}

	public Long getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(Long idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	public String getNomAdministrateur() {
		return nomAdministrateur;
	}

	public void setNomAdministrateur(String nomAdministrateur) {
		this.nomAdministrateur = nomAdministrateur;
	}

	public String getPrenomAdministrateur() {
		return prenomAdministrateur;
	}

	public void setPrenomAdministrateur(String prenomAdministrateur) {
		this.prenomAdministrateur = prenomAdministrateur;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + ", nomAdministrateur=" + nomAdministrateur
				+ ", prenomAdministrateur=" + prenomAdministrateur + "]";
	}

}
