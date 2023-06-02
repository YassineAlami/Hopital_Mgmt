package com.hopital;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hopital.entities.Medecin;
import com.hopital.repo.IMedecin;

@SpringBootApplication
public class HopitalV1Application implements CommandLineRunner
{

	
	public static void main(String[] args) {
		SpringApplication.run(HopitalV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		/*
		Medecin m1 = new Medecin("JILANI","Abdelkader","abdelkader@gmail.com","0661283017","M");
		Medecin m2 = new Medecin("Rifai","Ahmad","ahmad@gmail.com","0661283015","M");
		Medecin m3 = new Medecin("Ben Ali","Mohammad","mohammad@gmail.com","0661293017","M");
		
		repo.save(m1); repo.save(m2); repo.save(m3);
		*/
	}

}
