package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
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

@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "id_resp")
	private ResponsableAgence responsableAgence;
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "id_chauffeur")
	private Chauffeur chauffeur;
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Administrateur administrateur;

	public Utilisateur() {
	}

	public Utilisateur(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Utilisateur(String username, String password, Set<Role> roles, ResponsableAgence responsableAgence,
			Client client, Chauffeur chauffeur, Administrateur administrateur) {
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.responsableAgence = responsableAgence;
		this.client = client;
		this.chauffeur = chauffeur;
		this.administrateur = administrateur;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public ResponsableAgence getResponsableAgence() {
		return responsableAgence;
	}

	public void setResponsableAgence(ResponsableAgence responsableAgence) {
		this.responsableAgence = responsableAgence;
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

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [username=" + username + ", password=" + password + "]";
	}

}
