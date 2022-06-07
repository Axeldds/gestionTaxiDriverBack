package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	public Client(long idClient, String nomClient, String prenomClient, int age, String sexe, String ville) {
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.age = age;
		this.sexe = sexe;
		this.ville = ville;
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


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", age="
				+ age + ", sexe=" + sexe + ", ville=" + ville + "]";
	}
	
	
	
	
	
	
	
	

}
