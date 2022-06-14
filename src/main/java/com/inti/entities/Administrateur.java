package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Administrateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdministrateur;
	private String nomAdministrateur;
	private String prenomAdministrateur;
	@OneToMany(mappedBy = "administrateur")
	private List<Utilisateur> utilisateurs;

	public Administrateur() {

	}

	public Administrateur(String nomAdministrateur, String prenomAdministrateur) {
		this.nomAdministrateur = nomAdministrateur;
		this.prenomAdministrateur = prenomAdministrateur;
	}

	public Administrateur(String nomAdministrateur, String prenomAdministrateur, List<Utilisateur> utilisateurs) {
		this.nomAdministrateur = nomAdministrateur;
		this.prenomAdministrateur = prenomAdministrateur;
		this.utilisateurs = utilisateurs;
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

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + ", nomAdministrateur=" + nomAdministrateur
				+ ", prenomAdministrateur=" + prenomAdministrateur + "]";
	}

}
