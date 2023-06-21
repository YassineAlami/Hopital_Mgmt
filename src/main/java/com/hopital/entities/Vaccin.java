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
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table (name = "vaccins")
public class Vaccin
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private String libelle;
	
	@ManyToOne
	private TypeVaccin typevaccin;
	
	@ManyToMany
	@JoinTable(name = "dossier_vaccins",
			joinColumns = @JoinColumn(name = "vaccin_id"),
			inverseJoinColumns = @JoinColumn(name = "dossier_id"))
	private List<DossierMedical> dossiersmedicaux = new ArrayList<>();
}
