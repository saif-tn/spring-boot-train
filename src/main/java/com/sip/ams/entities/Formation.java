package com.sip.ams.entities;

public class Formation {
	private int id;
	private String lib;
	private double nbHeures;
	private String lang;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLib() {
		return lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public double getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(double nbHeures) {
		this.nbHeures = nbHeures;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	public Formation(int id, String lib, double hr, String lang) {
		this.id = id;
		this.lib = lib;
		this.nbHeures = hr;
		this.lang = lang;
	}
}
