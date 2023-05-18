package com.hopital.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;


@Entity
@Validated
@Table(name = "lits")
public class Lit
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private int num;
	private boolean sipris;
	
	@ManyToOne
	private Chambre chambre;
	
	public Lit () {}

	public Lit(int num, boolean sipris) 
	{
		super();
		this.num = num;
		this.sipris = sipris;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isSipris() {
		return sipris;
	}

	public void setSipris(boolean sipris) {
		this.sipris = sipris;
	}

	//@JsonManagedReference
	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
}
