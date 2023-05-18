package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Specialite;

@Repository
public interface ISpecialite extends JpaRepository<Specialite, Long>
{	

}
