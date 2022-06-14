package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reclamation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReclamation;
	private String texte;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_agence", referencedColumnName = "idAgence")
	private Agence agence;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_client", referencedColumnName = "idClient")
	private Client client;
	
	public Reclamation(String texte, Agence agence, Client client) {
		this.texte = texte;
		this.agence = agence;
		this.client = client;
	}

	public Reclamation() {
	}

	public Reclamation(String texte) {
		this.texte = texte;
	}

	public long getIdReclamation() {
		return idReclamation;
	}

	public void setIdReclamation(long idReclamation) {
		this.idReclamation = idReclamation;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reclamation [idReclamation=" + idReclamation + ", texte=" + texte + "]";
	}
}
