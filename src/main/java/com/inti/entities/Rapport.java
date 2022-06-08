package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rapport implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRapport;
	
	@ManyToOne
	@JoinColumn(name="id_responsable_agence")
	private ResponsableAgence responsableAgence;
	
	public Rapport() {
	}
	
	public Rapport(ResponsableAgence responsableAgence) {
		this.responsableAgence = responsableAgence;
	}

	public long getIdRapport() {
		return idRapport;
	}

	public void setIdRapport(long idRapport) {
		this.idRapport = idRapport;
	}
	
	public ResponsableAgence getResponsableAgence() {
		return responsableAgence;
	}

	public void setResponsableAgence(ResponsableAgence responsableAgence) {
		this.responsableAgence = responsableAgence;
	}

	@Override
	public String toString() {
		return "Rapport [idRapport=" + idRapport + "]";
	}

}
