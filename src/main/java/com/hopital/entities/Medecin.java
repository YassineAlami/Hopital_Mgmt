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
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "medecins")
public class Medecin 
{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	@NonNull
	private String email;
	@NonNull
	private String tel;
	@NonNull
	private String genre;
	@NonNull
	@ManyToOne
	private Specialite specialite;
	@NonNull
	@ManyToMany(mappedBy = "medecins")
	private List<Patient> patients = new ArrayList<>();

}
