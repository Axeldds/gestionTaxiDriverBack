package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reclamation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReclamation;
	private String texte;

	public Reclamation() {
	}

	public Reclamation(long idReclamation, String texte) {
		this.idReclamation = idReclamation;
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

	@Override
	public String toString() {
		return "Reclamation [idReclamation=" + idReclamation + ", texte=" + texte + "]";
	}

}
