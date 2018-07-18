package com.projectratt.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.FileWriter;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder


import com.google.api.client.json.Json;

@Entity
@Table(name = "Reponse")
public class Reponse implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	//JPA Hibernate 
	@Column(unique = true, nullable = false)
	private int id_reponse;
	
	@Column
	private String reponse_1; 
	
	@Column
	private String reponse_2;
	
	@Column
	private String reponse_3;
	
	@Column
	private String reponse_4;
	
	@Column
	private String reponse_5;
	
	public Reponse(){
		
	}
	
	public Reponse( String reponse_1, String reponse_2, String reponse_3, String reponse_4,
			String reponse_5, Sondage sondage) {
		super();
		this.reponse_1 = reponse_1;
		this.reponse_2 = reponse_2;
		this.reponse_3 = reponse_3;
		this.reponse_4 = reponse_4;
		this.reponse_5 = reponse_5;
		this.sondage = sondage;
	}
	public Reponse( String reponse_1, String reponse_2, String reponse_3, String reponse_4,
			String reponse_5, int id_sondage) {
		super();
		this.reponse_1 = reponse_1;
		this.reponse_2 = reponse_2;
		this.reponse_3 = reponse_3;
		this.reponse_4 = reponse_4;
		this.reponse_5 = reponse_5;
		this.sondage = new Sondage(id_sondage);
	}
	
	public int getId_reponse() {
		return id_reponse;
	}

	public void setId_reponse(int id_reponse) {
		this.id_reponse = id_reponse;
	}

	public String getReponse_1() {
		return reponse_1;
	}

	public void setReponse_1(String reponse_1) {
		this.reponse_1 = reponse_1;
	}

	public String getReponse_2() {
		return reponse_2;
	}

	public void setReponse_2(String reponse_2) {
		this.reponse_2 = reponse_2;
	}

	public String getReponse_3() {
		return reponse_3;
	}

	public void setReponse_3(String reponse_3) {
		this.reponse_3 = reponse_3;
	}

	public String getReponse_4() {
		return reponse_4;
	}

	public void setReponse_4(String reponse_4) {
		this.reponse_4 = reponse_4;
	}

	public String getReponse_5() {
		return reponse_5;
	}

	public void setReponse_5(String reponse_5) {
		this.reponse_5 = reponse_5;
	}

	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

	
	@ManyToOne(cascade = CascadeType.ALL)
	private Sondage sondage;
	

	
	//Convert to json data 
	/*public  String convertToJson(Reponse reponse ){
		
		Json gson = new Json();
		
		String jSon = new String();
		gson.toJson(reponse, new FileWriter("D:\\file.json"));
		
		
		
		
	}*/


}
