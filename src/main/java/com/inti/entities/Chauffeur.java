package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chauffeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChauffeur;
	private String nomChauffeur;
	private String prenomChauffeur;
	private int age;

	public Chauffeur() {

	}

	public Chauffeur(String nomChauffeur, String prenomChauffeur, int age) {
		this.nomChauffeur = nomChauffeur;
		this.prenomChauffeur = prenomChauffeur;
		this.age = age;
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

	@Override
	public String toString() {
		return "Chauffeur [idChauffeur=" + idChauffeur + ", nomChauffeur=" + nomChauffeur + ", prenomChauffeur="
				+ prenomChauffeur + ", age=" + age + "]";
	}

}
