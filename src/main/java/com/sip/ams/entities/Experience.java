package com.sip.ams.entities;

public class Experience {
	private int id;
	private String nom;
	private int date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public Experience(int id, String nom, int date) {
		this.id = id;
		this.nom = nom;
		this.date = date;
	}
	

}
