package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Taxi implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTaxi;
	private String immatriculation;
	private String modele;
	private String marque;
	private int kilometrage;
	private Chauffeur chauffeur;

	public Taxi() {

	}

	public Taxi(String immatriculation, String modele, String marque, int kilometrage) {
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.marque = marque;
		this.kilometrage = kilometrage;
	}

	public Taxi(String immatriculation, String modele, String marque, int kilometrage, Chauffeur chauffeur) {
		this.immatriculation = immatriculation;
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

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	@Override
	public String toString() {
		return "Taxi [idTaxi=" + idTaxi + ", immatriculation=" + immatriculation + ", modele=" + modele + ", marque="
				+ marque + ", kilometrage=" + kilometrage + "]";
	}

}
