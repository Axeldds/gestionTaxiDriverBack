package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trajet implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrajet;
	private String depart;
	private String arrivee;
	private int tempsTrajet;
	
	
	public Trajet() {
	}

	public Trajet(String depart, String arrivee, int tempsTrajet) {
		this.depart = depart;
		this.arrivee = arrivee;
		this.tempsTrajet = tempsTrajet;
	}

	public Long getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(Long idTrajet) {
		this.idTrajet = idTrajet;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrivee() {
		return arrivee;
	}

	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}

	public int getTempsTrajet() {
		return tempsTrajet;
	}

	public void setTempsTrajet(int tempsTrajet) {
		this.tempsTrajet = tempsTrajet;
	}
	
	
}
