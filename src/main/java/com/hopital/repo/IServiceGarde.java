package com.hopital.repo;

import com.hopital.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hopital.entities.ServiceGarde;

@Repository
public interface IServiceGarde extends JpaRepository<ServiceGarde, Long>{


}
