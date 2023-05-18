package com.hopital.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hospitalisation")
public class Hospitalisation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private LocalDate dateEntree;
	private LocalDate dateSortie;
	
	@ManyToOne
	private DossierMedical dossiermedical;
	
	public Hospitalisation() {}

	public Hospitalisation(LocalDate dateEntree, LocalDate dateSortie) 
	{
		super();
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
	}	
}
