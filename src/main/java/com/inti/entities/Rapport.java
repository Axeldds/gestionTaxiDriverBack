package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rapport implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRapport;

	public Rapport(long idRapport) {
		this.idRapport = idRapport;
	}

	public Rapport() {
	}

	public long getIdRapport() {
		return idRapport;
	}

	public void setIdRapport(long idRapport) {
		this.idRapport = idRapport;
	}

	@Override
	public String toString() {
		return "Rapport [idRapport=" + idRapport + "]";
	}

}
