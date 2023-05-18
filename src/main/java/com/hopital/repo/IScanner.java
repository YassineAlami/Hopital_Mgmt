package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Scanner;

@Repository
public interface IScanner extends JpaRepository<Scanner, Long> 
{

}
