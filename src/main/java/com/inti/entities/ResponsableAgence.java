package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ResponsableAgence implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResponsable;
	private String nomResponsable;
	private String prenomResponsable;
	@OneToMany(mappedBy = "responsableAgence")
	private List<Annonce> annonces = new ArrayList<>();
	@OneToMany(mappedBy = "responsableAgence")
	private List<Rapport> rapports = new ArrayList<>();
	@OneToOne(mappedBy = "resp")
	private Agence agence;
	@OneToMany(mappedBy = "responsableAgence")
	private List<Utilisateur> utilisateurs = new ArrayList<>();

	public ResponsableAgence() {

	}

	public ResponsableAgence(String nomResponsable, String prenomResponsable) {
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
	}

	public ResponsableAgence(String nomResponsable, String prenomResponsable, List<Annonce> annonces) {
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.annonces = annonces;
	}

	public ResponsableAgence(String nomResponsable, String prenomResponsable, List<Annonce> annonces,
			List<Rapport> rapports, Agence agence) {
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.annonces = annonces;
		this.rapports = rapports;
		this.agence = agence;
	}

	public List<Annonce> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}

	public List<Rapport> getRapports() {
		return rapports;
	}

	public void setRapports(List<Rapport> rapports) {
		this.rapports = rapports;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
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
