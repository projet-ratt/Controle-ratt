package com.projectratt.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Theme")
public class Theme {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	//JPA Hibernate 
	@Column(unique = true, nullable = false)
	private int id_theme;
	@Column
	private String nom_theme;
	
	public Theme(){
		
	}

	public Theme(String nom_theme) {
		super();
		
		this.nom_theme = nom_theme;
	}

	public int getId_theme() {
		return id_theme;
	}

	public void setId_theme(int id_theme) {
		this.id_theme = id_theme;
	}

	public String getNom_theme() {
		return nom_theme;
	}

	public void setNom_theme(String nom_theme) {
		this.nom_theme = nom_theme;
	}
	

}
