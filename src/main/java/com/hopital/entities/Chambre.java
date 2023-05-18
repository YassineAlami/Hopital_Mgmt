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
@Table(name = "chambres")
public class Chambre 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long num;
	private String type;

	@OneToMany(mappedBy = "chambre")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Lit> lits;

	public Chambre () {}

	public Chambre(long num, String type) {
		super();
		this.num = num;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonBackReference
	public List<Lit> getLits() {
		return lits;
	}

	public void setLits(List<Lit> lits) {
		this.lits = lits;
	}
	
	
	

}
