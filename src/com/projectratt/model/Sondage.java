package com.projectratt.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.soap.Text;

@Entity
@Table(name = "Sondage")
public class Sondage implements Serializable {
	
	//Le sondage contient au max 5 question : 
	
	public String getTitre_sondage() {
		return titre_sondage;
	}

	public int getId_sondage() {
		return id_sondage;
	}

	public void setId_sondage(int id_sondage) {
		this.id_sondage = id_sondage;
	}

	public String getQuestion_1() {
		return question_1;
	}

	public void setQuestion_1(String question_1) {
		this.question_1 = question_1;
	}

	public String getQuestion_2() {
		return question_2;
	}

	public void setQuestion_2(String question_2) {
		this.question_2 = question_2;
	}

	public String getQuestion_3() {
		return question_3;
	}

	public void setQuestion_3(String question_3) {
		this.question_3 = question_3;
	}

	public String getQuestion_4() {
		return question_4;
	}

	public void setQuestion_4(String question_4) {
		this.question_4 = question_4;
	}
	//show that a method is not te be persist in database 
	@Transient
	public String getQuestion_5() {
		return question_5;
	}

	public void setQuestion_5(String question_5) {
		this.question_5 = question_5;
	}

	public void setTitre_sondage(String titre_sondage) {
		this.titre_sondage = titre_sondage;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	//JPA Hibernate 
	@Column(unique = true, nullable = false)
	private int id_sondage;
	
	@Column
	private String titre_sondage; 
	
	
	
	@Column
	private String question_1; 
	
	@Column
	private String question_2;
	
	@Column
	private String question_3;
	
	@Column
	private String question_4;
	
	@Column
	private String question_5;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Admin admin;
	
	public Sondage(){
		
	}
	
	public Sondage( String titre_sondage, String question_1, String question_2, String question_3, String question_4,
			String question_5, Theme theme, Admin user) {
		super();
		this.titre_sondage = titre_sondage;
		this.question_1 = question_1;
		this.question_2 = question_2;
		this.question_3 = question_3;
		this.question_4 = question_4;
		this.question_5 = question_5;
		this.theme = theme;
		this.admin = user;
	}
	public Sondage (int id_sondage){
		this.id_sondage = id_sondage;
	}

	@ManyToOne
	private Theme theme;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	} 
	
	public int getId_Admin(){
		return admin.getId_admin();
	}
	
	
	
	
	
	
	
	

}
