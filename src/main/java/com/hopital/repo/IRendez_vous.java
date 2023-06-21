package com.hopital.repo;

import com.hopital.entities.Rendez_Vous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRendez_vous extends JpaRepository<Rendez_Vous,Long> {
}
