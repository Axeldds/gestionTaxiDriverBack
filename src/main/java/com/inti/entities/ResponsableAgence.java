package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ResponsableAgence implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResponsable;
	private String nomResponsable;
	private String prenomResponsable;
	@OneToMany(mappedBy = "resp")
	private List<Annonce> annonces = new ArrayList<>();

	public ResponsableAgence() {

	}

	public ResponsableAgence(String nomResponsable, String prenomResponsable) {
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
	}

	public ResponsableAgence(Long idResponsable, String nomResponsable, String prenomResponsable,
			List<Annonce> annonces) {
		this.idResponsable = idResponsable;
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.annonces = annonces;
	}

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public String getPrenomResponsable() {
		return prenomResponsable;
	}

	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}

	@Override
	public String toString() {
		return "ResponsableAgence [idResponsable=" + idResponsable + ", nomResponsable=" + nomResponsable
				+ ", prenomResponsable=" + prenomResponsable + "]";
	}

}
