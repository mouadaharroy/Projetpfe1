package org.sid.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hopital implements Serializable {
	@Id 
	@GeneratedValue
	private long id;
	private String adresse;
	private String email;
	private String departement;
	private String photo;
	private long tel;
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hopital(String adresse, String email, String departement, String photo, long tel) {
		super();
		this.adresse = adresse;
		this.email = email;
		this.departement = departement;
		this.photo = photo;
		this.tel = tel;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	

}
