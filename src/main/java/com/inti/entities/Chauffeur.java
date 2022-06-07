package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Chauffeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChauffeur;
	private String nomChauffeur;
	private String prenomChauffeur;
	private int age;
	@OneToMany(mappedBy = "chauffeur")
	private List<Utilisateur> utilisateurs;
	@OneToMany(mappedBy = "chauffeur")
	private List<Avis> aviss;
	@OneToOne(mappedBy = "chauffeur")
	private Taxi taxi;

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

	@Override
	public String toString() {
		return "Chauffeur [idChauffeur=" + idChauffeur + ", nomChauffeur=" + nomChauffeur + ", prenomChauffeur="
				+ prenomChauffeur + ", age=" + age + "]";
	}

}
