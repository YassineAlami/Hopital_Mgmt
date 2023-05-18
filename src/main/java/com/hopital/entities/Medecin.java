package com.hopital.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "medecins")
public class Medecin 
{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String genre;
	
	@ManyToOne
	private Specialite specialite;
	
	@ManyToMany(mappedBy = "medecins")
	private List<Patient> patients = new ArrayList<>();
	
	/*
	 * @ManyToMany(mappedBy = "services_garde") private List<ServiceGarde>
	 * servicesgarde = new ArrayList<>();
	 */
	public Medecin() {}
	
	public Medecin(String nom, String prenom, String email, String tel, String genre) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.genre = genre;
	}	
}
