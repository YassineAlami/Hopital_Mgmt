package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hopital.entities.Traitement;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.ITraitement;

@RestController
@RequestMapping("api/v1")
public class TraitementController 
{
	@Autowired
	private ITraitement repo;
	
	@GetMapping("/Traitements")
	public List<Traitement> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/AddTraitements")
	public Traitement createLit (@RequestBody Traitement t)
	{
		return repo.save(t);
	}

	@GetMapping("/Traitements/{id}")
	public ResponseEntity<Traitement> getLitById(@PathVariable long id)
	{
		Traitement t = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Traitement avec cet ID : "+id));

		return ResponseEntity.ok(t);
	}

	@PutMapping("/Traitements/{id}")
	public ResponseEntity<Traitement> updateChambre (@RequestBody Traitement tDetails, @PathVariable long id) 
	{
		Traitement t = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Traitement avec cet ID : "+id));

		t.setFrais(tDetails.getFrais());
		t.setLibelle(tDetails.getLibelle());

		Traitement updatedT = repo.save(t);
		return ResponseEntity.ok(updatedT);
	}

	@DeleteMapping("/Traitements/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Traitement t = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Traitement avec cet ID : "+id));

		repo.delete(t);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
