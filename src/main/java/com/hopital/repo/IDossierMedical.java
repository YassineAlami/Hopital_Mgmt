package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.DossierMedical;

@Repository
public interface IDossierMedical extends JpaRepository<DossierMedical, Long>
{

}
