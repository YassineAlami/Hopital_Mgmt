package com.hopital.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table (name = "maladies")
public class Maladie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	
	@ManyToOne
	private TypeMaladie typemaladie;
	
	
	@ManyToMany
	@JoinTable(name = "dossier_maladies",
			joinColumns = @JoinColumn(name = "maladie_id"),
			inverseJoinColumns = @JoinColumn(name = "dossier_id"))
	private List<DossierMedical> dossiersmedicaux = new ArrayList<>();
	
	
	public Maladie() {}

	public Maladie(String libelle)
	{
		super();
		this.libelle = libelle;
	}
	
}
