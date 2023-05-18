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

import com.hopital.entities.TypeMaladie;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.ITypeMaladie;

@RestController
@RequestMapping("api/v1")
public class TypeMaladieController 
{
	@Autowired
	private ITypeMaladie repo;
	
	@GetMapping("/TypesMaladies")
	public List<TypeMaladie> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/TypesMaladies")
	public TypeMaladie createLit (@RequestBody TypeMaladie tm)
	{
		return repo.save(tm);
	}

	@GetMapping("/TypesMaladies/{id}")
	public ResponseEntity<TypeMaladie> getLitById(@PathVariable long id)
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));

		return ResponseEntity.ok(tm);
	}

	@PutMapping("/TypesMaladies/{id}")
	public ResponseEntity<TypeMaladie> updateChambre (@RequestBody TypeMaladie tmDetails, @PathVariable long id) 
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));

		tm.setLibelle(tmDetails.getLibelle());

		TypeMaladie updatedTm = repo.save(tm);
		return ResponseEntity.ok(updatedTm);
	}

	@DeleteMapping("/TypesMaladies/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));

		repo.delete(tm);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	

}
