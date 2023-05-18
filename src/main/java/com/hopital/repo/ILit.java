package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Lit;

@Repository
public interface ILit extends JpaRepository<Lit, Long>
{

}
