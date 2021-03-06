package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Agence implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgence;
	private String nomAgence;
	private String adresse;
	private float chiffreAffaire;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_resp", referencedColumnName = "idResponsable")
	private ResponsableAgence resp;
	@OneToMany(mappedBy = "agence")
	@JsonIgnore
	private List<Reclamation> reclamations = new ArrayList<>();
	@OneToMany(mappedBy = "agence")
	@JsonIgnore
	private List<Chauffeur> chauffeurs = new ArrayList<>();

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

	public Agence(String nomAgence, String adresse, float chiffreAffaire, ResponsableAgence resp,
			List<Reclamation> reclamations, List<Chauffeur> chauffeurs) {
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.chiffreAffaire = chiffreAffaire;
		this.resp = resp;
		this.reclamations = reclamations;
		this.chauffeurs = chauffeurs;
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

	public List<Chauffeur> getChauffeurs() {
		return chauffeurs;
	}

	public void setChauffeurs(List<Chauffeur> chauffeurs) {
		this.chauffeurs = chauffeurs;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", nomAgence=" + nomAgence + ", adresse=" + adresse
				+ ", chiffreAffaire=" + chiffreAffaire + "]";
	}

}
