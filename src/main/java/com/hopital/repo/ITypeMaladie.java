package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.TypeMaladie;

@Repository
public interface ITypeMaladie extends JpaRepository<TypeMaladie, Long>
{

}
