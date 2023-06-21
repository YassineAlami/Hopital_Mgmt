package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hopital.service.TypeVaccinService;
import com.hopital.service.VaccinService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hopital.entities.TypeVaccin;
import com.hopital.entities.Vaccin;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.ITypeVaccin;
import com.hopital.repo.IVaccin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class VaccinController 
{
	@NonNull
	private VaccinService repo;
	@NonNull
	private TypeVaccinService tvrepo;
	
	@GetMapping("/Vaccins")
	public List<Vaccin> getVaccins()
	{
		return repo.findAll();
	}

	@PostMapping("/AddVaccins")
	public Vaccin createVaccin (@RequestBody Vaccin v)
	{
		return repo.save(v);
	}

	@GetMapping("/Vaccins/{id}")
	public ResponseEntity<Vaccin> getVaccinById(@PathVariable long id)
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));

		return ResponseEntity.ok(v);
	}

	@PutMapping("/updateVaccins/{id}")
	public ResponseEntity<Vaccin> updateVaccin (@RequestBody Vaccin vDetails, @PathVariable long id)
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));

		v.setLibelle(vDetails.getLibelle());
		v.setTypevaccin(vDetails.getTypevaccin());

		Vaccin updatedV = repo.save(v);
		return ResponseEntity.ok(updatedV);
	}

	@DeleteMapping("/DeleteVaccins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));
		repo.delete(v);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
