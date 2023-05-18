package com.hopital.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admins")
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	
	public Admin () {}

	public Admin(String nom, String prenom, String email) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

}
