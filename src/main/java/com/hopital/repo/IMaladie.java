package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Maladie;

@Repository
public interface IMaladie extends JpaRepository<Maladie, Long>
{

}
