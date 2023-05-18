package com.hopital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopital.entities.Operation;

@Repository
public interface IOperation extends JpaRepository<Operation, Long>
{
}
