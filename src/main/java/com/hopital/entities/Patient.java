package com.hopital.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "patients")
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate datenaissance;

	@ManyToMany
	@JoinTable(name = "patients_medecins",
			joinColumns = @JoinColumn(name = "patient_id"),
			inverseJoinColumns = @JoinColumn(name = "medecins_id"))
	private List<Medecin> medecins = new ArrayList<>();
	@OneToMany
	List<Rendez_Vous> rendez_vous=new ArrayList<>();
}
