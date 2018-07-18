package com.projectratt.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "Admin")
public class Admin implements Serializable {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	//JPA Hibernate 
	@Column(unique = true, nullable = false)
	private int id_admin;
	@Column 
	private String login;

	@Column
	private String password;

	@Column
	private String first_name;

	@Column
	private String last_name;
	
	@Column
	private String email;
	
	

	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	
	public Admin(){
		
	}

	public Admin(String login, String password, String first_name, String last_name, String email
			) {
		super();
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		//this.sondage = sondage;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}*/
	public Admin(int id_admin){
		this.id_admin = id_admin;
	}
	
	
	
	
	

}
