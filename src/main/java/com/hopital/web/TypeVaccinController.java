package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hopital.service.TypeVaccinService;
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
import com.hopital.entities.TypeVaccin;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class TypeVaccinController 
{
	@NonNull
	private TypeVaccinService repo;

	@GetMapping("/TypesVaccins")
	public List<TypeVaccin> getTypev()
	{
		return repo.findAll();
	}

	@PostMapping("/AddTypesVaccins")
	public TypeVaccin createTypeV (@RequestBody TypeVaccin tv)
	{
		return repo.save(tv);
	}

	@GetMapping("/TypesVaccins/{id}")
	public ResponseEntity<TypeVaccin> getTypeVById(@PathVariable long id)
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));

		return ResponseEntity.ok(tv);
	}

	@PutMapping("/TypesVaccins/{id}")
	public ResponseEntity<TypeVaccin> updateTypeV (@RequestBody TypeVaccin tvDetails, @PathVariable long id)
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));
		tv.setLibelle(tvDetails.getLibelle());
		TypeVaccin updatedTv = repo.save(tv);
		return ResponseEntity.ok(updatedTv);
	}

	@DeleteMapping("/TypesVaccins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteTypeV (@PathVariable long id)
	{
		TypeVaccin tv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+id));
		repo.delete(tv);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}



}
