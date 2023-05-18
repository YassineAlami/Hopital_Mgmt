package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Patient;

@Repository
public interface IPatient extends JpaRepository<Patient, Long>
{

}
