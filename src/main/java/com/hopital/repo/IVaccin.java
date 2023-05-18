package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Vaccin;

@Repository
public interface IVaccin extends JpaRepository<Vaccin, Long>
{

}
