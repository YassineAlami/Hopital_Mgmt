package com.hopital.entities;

import java.time.LocalDate;
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

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "patients")
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String genre;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate datenaissance;
	
	@ManyToMany
	@JoinTable(name = "patients_medecins",
			joinColumns = @JoinColumn(name = "patient_id"),
			inverseJoinColumns = @JoinColumn(name = "medecins_id"))
	private List<Medecin> medecins = new ArrayList<>();
	
	
	public Patient() {}

	public Patient(String nom, String prenom, String email, String tel, String genre, LocalDate datenaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.genre = genre;
		this.datenaissance = datenaissance;
	}	
}
