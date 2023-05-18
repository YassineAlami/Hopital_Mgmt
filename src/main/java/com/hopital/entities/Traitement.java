package com.hopital.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "traitements")
public class Traitement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	private double frais;
	
	public Traitement() {}

	public Traitement(String libelle, double frais)
	{
		super();
		this.libelle = libelle;
		this.frais = frais;
	}
	
}
