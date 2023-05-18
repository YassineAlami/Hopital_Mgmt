package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Medecin;

@Repository
public interface IMedecin extends JpaRepository<Medecin,Long>
{

}
