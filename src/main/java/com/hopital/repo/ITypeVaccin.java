package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.TypeVaccin;

@Repository
public interface ITypeVaccin extends JpaRepository<TypeVaccin, Long> 
{
}
