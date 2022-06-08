package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String titre;
	private String note;
	private String commentaire;
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "id_chauffeur")
	private Chauffeur chauffeur;
	
	public Avis() {
	}

	public Avis(String titre, String note, String commentaire) {
		this.titre = titre;
		this.note = note;
		this.commentaire = commentaire;
	}

	public Avis(String titre, String note, String commentaire, Client client, Chauffeur chauffeur) {
		this.titre = titre;
		this.note = note;
		this.commentaire = commentaire;
		this.client = client;
		this.chauffeur = chauffeur;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}
	
	
	
}
