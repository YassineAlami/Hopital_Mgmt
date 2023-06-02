package com.hopital.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data @NoArgsConstructor @RequiredArgsConstructor
@Entity
@Validated
@Table(name = "lits")
public class Lit
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	@Column(unique = true)
	private int num;
	@NonNull
	private boolean sipris;
	@NonNull
	@ManyToOne
	private Chambre chambre;
}
