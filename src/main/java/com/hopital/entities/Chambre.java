package com.hopital.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "chambres")
public class Chambre 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private long num;
	@NonNull
	private String type;
	@OneToMany(mappedBy = "chambre")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Lit> lits;
}
