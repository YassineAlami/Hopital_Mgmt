package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hopital.service.TypeMaladieService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class TypeMaladieController 
{
	@NonNull
	private TypeMaladieService repo;
	
	@GetMapping("/TypesMaladies")
	public List<TypeMaladie> getTypem()
	{
		return repo.findAll();
	}

	@PostMapping("/AddTypesMaladies")
	public TypeMaladie createTypem (@RequestBody TypeMaladie tm)
	{
		return repo.save(tm);
	}

	@GetMapping("/TypesMaladies/{id}")
	public ResponseEntity<TypeMaladie> getTypemById(@PathVariable long id)
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));
		return ResponseEntity.ok(tm);
	}
	@PutMapping("/TypesMaladies/{id}")
	public ResponseEntity<TypeMaladie> updateTypem (@RequestBody TypeMaladie tmDetails, @PathVariable long id)
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));
		tm.setLibelle(tmDetails.getLibelle());
		TypeMaladie updatedTm = repo.save(tm);
		return ResponseEntity.ok(updatedTm);
	}
	@DeleteMapping("/TypesMaladies/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteTypem (@PathVariable long id)
	{
		TypeMaladie tm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+id));
		repo.delete(tm);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
