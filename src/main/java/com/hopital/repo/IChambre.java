package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Chambre;

@Repository
public interface IChambre extends JpaRepository<Chambre, Long>
{	

}
