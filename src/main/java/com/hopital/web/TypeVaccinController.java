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

import com.hopital.entities.TypeVaccin;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.ITypeVaccin;

@RestController
@RequestMapping("api/v1")
public class TypeVaccinController 
{
	@Autowired
	private ITypeVaccin repo;
	
	
	@GetMapping("/TypesVaccins")
	public List<TypeVaccin> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/TypesVaccins")
	public TypeVaccin createLit (@RequestBody TypeVaccin tv)
	{
		return repo.save(tv);
	}

	@GetMapping("/TypesVaccins/{id}")
	public ResponseEntity<TypeVaccin> getLitById(@PathVariable long id)
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));

		return ResponseEntity.ok(tv);
	}

	@PutMapping("/TypesVaccins/{id}")
	public ResponseEntity<TypeVaccin> updateChambre (@RequestBody TypeVaccin tvDetails, @PathVariable long id) 
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));

		tv.setLibelle(tvDetails.getLibelle());

		TypeVaccin updatedTv = repo.save(tv);
		return ResponseEntity.ok(updatedTv);
	}

	@DeleteMapping("/TypesVaccins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));

		repo.delete(tv);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}



}
