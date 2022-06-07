package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Taxi implements Serializable {
	private Long idTaxi;
	private String modele;
	private String marque;
	private int kilometrage;

	public Taxi() {

	}

	public Taxi(String modele, String marque, int kilometrage) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.kilometrage = kilometrage;
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

	@Override
	public String toString() {
		return "Taxi [idTaxi=" + idTaxi + ", modele=" + modele + ", marque=" + marque + ", kilometrage=" + kilometrage
				+ "]";
	}

}
