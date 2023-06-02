package com.hopital.repo;

import com.hopital.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdmin extends JpaRepository<Admin, Long>
{

}
