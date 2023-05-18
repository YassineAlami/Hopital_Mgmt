package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Admin;

@Repository
public interface IAdmin extends JpaRepository<Admin, Long>
{

}
