package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Traitement;

@Repository
public interface ITraitement extends JpaRepository<Traitement, Long> 
{
}
