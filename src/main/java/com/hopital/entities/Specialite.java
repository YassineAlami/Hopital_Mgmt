package com.hopital.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table (name = "specialites")
public class Specialite 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	
	@OneToMany(mappedBy = "specialite")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Medecin> medecins;
	
	public Specialite(){}

	public Specialite(String libelle) {
		super();
		this.libelle = libelle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@JsonBackReference
	public List<Medecin> getMedecins() {
		return medecins;
	}

	public void setMedecins(List<Medecin> medecins) {
		this.medecins = medecins;
	}
	
	
	
	
	
	
}
