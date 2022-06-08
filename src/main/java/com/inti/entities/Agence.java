package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agence implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgence;
	private String nomAgence;
	private String adresse;
	private float chiffreAffaire;
	@OneToOne
	private ResponsableAgence resp;
	@OneToMany(mappedBy = "agence")
	private List<Reclamation> reclamations = new ArrayList<>();

	public Agence() {

	}

	public Agence(String nomAgence, String adresse, float chiffreAffaire) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.chiffreAffaire = chiffreAffaire;
	}
	
	

	public Agence(String nomAgence, String adresse, float chiffreAffaire, ResponsableAgence resp,
			List<Reclamation> reclamations) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.chiffreAffaire = chiffreAffaire;
		this.resp = resp;
		this.reclamations = reclamations;
	}

	
	
	public ResponsableAgence getResp() {
		return resp;
	}

	public void setResp(ResponsableAgence resp) {
		this.resp = resp;
	}

	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
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

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", nomAgence=" + nomAgence + ", adresse=" + adresse
				+ ", chiffreAffaire=" + chiffreAffaire + "]";
	}

	

}
