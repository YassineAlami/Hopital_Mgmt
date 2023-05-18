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
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "operations")
public class Operation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	
	@ManyToMany
	@JoinTable(name = "dossier_operations",
			joinColumns = @JoinColumn(name = "operation_id"),
			inverseJoinColumns = @JoinColumn(name = "dossier_id"))
	private List<DossierMedical> dossiersmedicaux = new ArrayList<>();
	
	
	public Operation() {}

	public Operation(String libelle) 
	{
		super();
		this.libelle = libelle;
	}
	
}
