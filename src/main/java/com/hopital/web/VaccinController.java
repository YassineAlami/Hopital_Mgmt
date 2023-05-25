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
import com.hopital.entities.Vaccin;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.ITypeVaccin;
import com.hopital.repo.IVaccin;

@RestController
@RequestMapping("api/v1")
public class VaccinController 
{
	@Autowired
	private IVaccin repo;
	
	@Autowired
	private ITypeVaccin tvrepo;
	
	@GetMapping("/Vaccins")
	public List<Vaccin> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Vaccins/{idtv}")
	public Vaccin createLit (@RequestBody Vaccin v ,@PathVariable long idtv )
	{
		TypeVaccin tv = tvrepo.findById(idtv).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Vaccin avec cet ID : "+idtv));
		
		v.setTypevaccin(tv);
		
		return repo.save(v);
	}

	@GetMapping("/Vaccins/{id}")
	public ResponseEntity<Vaccin> getLitById(@PathVariable long id)
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));

		return ResponseEntity.ok(v);
	}

	@PutMapping("/Vaccins/{id}")
	public ResponseEntity<Vaccin> updateChambre (@RequestBody Vaccin vDetails, @PathVariable long id) 
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));

		v.setLibelle(vDetails.getLibelle());
		v.setTypevaccin(vDetails.getTypevaccin());

		Vaccin updatedV = repo.save(v);
		return ResponseEntity.ok(updatedV);
	}

	@DeleteMapping("/Vaccins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Vaccin v = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Vaccin avec cet ID : "+id));
		repo.delete(v);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
