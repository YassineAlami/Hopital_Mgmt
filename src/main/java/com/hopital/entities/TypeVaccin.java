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
@Table (name = "types_vaccins")
public class TypeVaccin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	
	@OneToMany(mappedBy = "typevaccin")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Vaccin> vaccins;
	
	public TypeVaccin() {}

	public TypeVaccin(String libelle)
	{
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
	public List<Vaccin> getVaccins() {
		return vaccins;
	}

	public void setVaccins(List<Vaccin> vaccins) {
		this.vaccins = vaccins;
	}
	
	
}
