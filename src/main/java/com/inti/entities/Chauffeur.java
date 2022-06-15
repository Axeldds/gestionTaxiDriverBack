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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chauffeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChauffeur;
	private String nomChauffeur;
	private String prenomChauffeur;
	private int age;
	@OneToMany(mappedBy = "chauffeur")
	private List<Utilisateur> utilisateurs = new ArrayList<>();
	@OneToMany(mappedBy = "chauffeur")
	private List<Avis> aviss = new ArrayList<>();
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_taxi", referencedColumnName = "idTaxi")
	private Taxi taxi;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_agence", referencedColumnName = "idAgence")
	private Agence agence;
	@OneToMany(mappedBy = "chauffeur")
	@JsonIgnore
	private List<Reservation> reservations = new ArrayList<>();

	public Chauffeur() {

	}

	public Chauffeur(String nomChauffeur, String prenomChauffeur, int age) {
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
		this.age = age;
	}

	public Chauffeur(String nomChauffeur, String prenomChauffeur, int age, List<Utilisateur> utilisateurs,
			List<Avis> aviss, Taxi taxi) {
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
		this.age = age;
		this.utilisateurs = utilisateurs;
		this.aviss = aviss;
		this.taxi = taxi;
	}

	public Chauffeur(String nomChauffeur, String prenomChauffeur, int age, List<Utilisateur> utilisateurs,
			List<Avis> aviss, Taxi taxi, Agence agence) {
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
		this.age = age;
		this.utilisateurs = utilisateurs;
		this.aviss = aviss;
		this.taxi = taxi;
		this.agence = agence;
	}

	public Chauffeur(String nomChauffeur, String prenomChauffeur, int age, List<Utilisateur> utilisateurs,
			List<Avis> aviss, Taxi taxi, Agence agence, List<Reservation> reservations) {
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
		this.age = age;
		this.utilisateurs = utilisateurs;
		this.aviss = aviss;
		this.taxi = taxi;
		this.agence = agence;
		this.reservations = reservations;
	}

	public Long getIdChauffeur() {
		return idChauffeur;
	}

	public void setIdChauffeur(Long idChauffeur) {
		this.idChauffeur = idChauffeur;
	}

	public String getNomChauffeur() {
		return nomChauffeur;
	}

	public void setNomChauffeur(String nomChauffeur) {
		this.nomChauffeur = nomChauffeur;
	}

	public String getPrenomChauffeur() {
		return prenomChauffeur;
	}

	public void setPrenomChauffeur(String prenomChauffeur) {
		this.prenomChauffeur = prenomChauffeur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public List<Avis> getAviss() {
		return aviss;
	}

	public void setAviss(List<Avis> aviss) {
		this.aviss = aviss;
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Chauffeur [idChauffeur=" + idChauffeur + ", nomChauffeur=" + nomChauffeur + ", prenomChauffeur="
				+ prenomChauffeur + ", age=" + age + "]";
	}

}
