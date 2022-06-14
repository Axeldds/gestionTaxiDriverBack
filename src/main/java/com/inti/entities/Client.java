package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idClient;
	private String nomClient;
	private String prenomClient;
	private int age;
	private String sexe;
	private String ville;
	@OneToMany(mappedBy="client")
	@JsonIgnore
	private List<Avis> aviss=new ArrayList<>();
	@OneToMany(mappedBy="client")
	@JsonIgnore
	private List<Reservation> reservations=new ArrayList<>();
	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Reclamation> reclamations=new ArrayList<>();
	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Utilisateur> utilisateurs=new ArrayList<>();

	public Client(String nomClient, String prenomClient, int age, String sexe, String ville) {
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.age = age;
		this.sexe = sexe;
		this.ville = ville;
	}

	public Client(String nomClient, String prenomClient, int age, String sexe, String ville, List<Avis> aviss,
			List<Reservation> reservations, List<Reclamation> reclamations, List<Utilisateur> utilisateurs) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.age = age;
		this.sexe = sexe;
		this.ville = ville;
		this.aviss = aviss;
		this.reservations = reservations;
		this.reclamations = reclamations;
		this.utilisateurs = utilisateurs;
	}


	public Client() {
	}


	public long getIdClient() {
		return idClient;
	}


	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Avis> getAviss() {
		return aviss;
	}


	public void setAviss(List<Avis> aviss) {
		this.aviss = aviss;
	}

	
	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", age="
				+ age + ", sexe=" + sexe + ", ville=" + ville + "]";
	}
	
	
	
	
	
	
	
	

}
