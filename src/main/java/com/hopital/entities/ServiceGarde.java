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

import lombok.Data;

@Data
@Entity
@Table(name = "services_gardes")
public class ServiceGarde 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private LocalDate dateservice;
	
	
	@ManyToMany
	@JoinTable(name = "patients",
			joinColumns = @JoinColumn(name = "service_id"),
			inverseJoinColumns = @JoinColumn(name = "medecin_id"))
	private List<Medecin> medecins = new ArrayList<>();
	
	
	public ServiceGarde() {}

	public ServiceGarde(LocalDate dateservice) {
		super();
		this.dateservice = dateservice;
	}
}
