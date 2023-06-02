package com.hopital.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Data @NoArgsConstructor @RequiredArgsConstructor
@Entity
@Table (name = "dossier_medical")
public class DossierMedical
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NonNull
	@OneToMany(mappedBy = "dossiermedical")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Hospitalisation> hospitalisations;


	@ManyToMany(mappedBy = "dossiersmedicaux")
	/*
	 * @JoinTable(name = "dossier_maladies", joinColumns = @JoinColumn(name =
	 * "dossier_id"), inverseJoinColumns = @JoinColumn(name = "maladie_id"))
	 */
	private List<Maladie> maladies = new ArrayList<>();

	@ManyToMany(mappedBy = "dossiersmedicaux")
	private List<Vaccin> vaccins = new ArrayList<>();

	@ManyToMany(mappedBy = "dossiersmedicaux")
	private List<Operation> operations = new ArrayList<>();

	@ManyToMany(mappedBy = "dossiersmedicaux")
	private List<Scanner> scanners = new ArrayList<>();
}
