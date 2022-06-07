package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Taxi implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTaxi;
	private String modele;
	private String marque;
	private int kilometrage;
	@OneToOne
	private Chauffeur chauffeur;

	public Taxi() {

	}

	public Taxi(String modele, String marque, int kilometrage) {
		this.modele = modele;
		this.marque = marque;
		this.kilometrage = kilometrage;
	}

	public Taxi(String modele, String marque, int kilometrage, Chauffeur chauffeur) {
		this.modele = modele;
		this.marque = marque;
		this.kilometrage = kilometrage;
		this.chauffeur = chauffeur;
	}

	public Long getIdTaxi() {
		return idTaxi;
	}

	public void setIdTaxi(Long idTaxi) {
		this.idTaxi = idTaxi;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	@Override
	public String toString() {
		return "Taxi [idTaxi=" + idTaxi + ", modele=" + modele + ", marque=" + marque + ", kilometrage=" + kilometrage
				+ "]";
	}

}
