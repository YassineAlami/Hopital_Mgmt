package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Hospitalisation;

@Repository
public interface IHospitalisation extends JpaRepository<Hospitalisation, Long>
{
	
}