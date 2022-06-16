package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reservation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateDebut;
	private Date dateFin;
	private float prix;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_client", referencedColumnName = "idClient")
	private Client client;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_trajet", referencedColumnName = "idTrajet")
	private Trajet trajet;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_annonce", referencedColumnName = "idAnnonce")
	private Annonce annonce;

	@JoinColumn(name = "id_chauffeur", referencedColumnName = "idChauffeur")
	private Chauffeur chauffeur;

	public Reservation() {
	}

	public Reservation(Date dateDebut, Date dateFin, float prix) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
	}

	public Reservation(Date dateDebut, Date dateFin, float prix, Client client, Trajet trajet, Annonce annonce) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.client = client;
		this.trajet = trajet;
		this.annonce = annonce;
	}

	public Reservation(Date dateDebut, Date dateFin, Client client, Trajet trajet, Chauffeur chauffeur) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.client = client;
		this.trajet = trajet;
		this.chauffeur = chauffeur;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", prix=" + prix + ", client=" + client + ", trajet=" + trajet + ", annonce=" + annonce
				+ ", chauffeur=" + chauffeur + "]";
	}

}
