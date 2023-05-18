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

import com.hopital.entities.Maladie;
import com.hopital.entities.TypeMaladie;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IMaladie;
import com.hopital.repo.ITypeMaladie;


@RestController
@RequestMapping("api/v1")
public class MaladieController 
{
	@Autowired
	private IMaladie repo;
	
	@Autowired
	private ITypeMaladie tmrepo;

	@GetMapping("/Maladies")
	public List<Maladie> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Maladies/{idtm}")
	public Maladie createLit (@RequestBody Maladie m ,@PathVariable long idtm)
	{
		TypeMaladie tm = tmrepo.findById(idtm).orElseThrow(()-> new ResourceNotFoundException("Pas de Type de Maladie avec cet ID : "+idtm));
		
		m.setTypemaladie(tm);
		
		return repo.save(m);
	}

	@GetMapping("/Maladies/{id}")
	public ResponseEntity<Maladie> getLitById(@PathVariable long id)
	{
		Maladie m = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Maladie avec cet ID : "+id));

		return ResponseEntity.ok(m);
	}

	@PutMapping("/Maladies/{id}")
	public ResponseEntity<Maladie> updateChambre (@RequestBody Maladie mDetails, @PathVariable long id) 
	{
		Maladie m = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Maladie avec cet ID : "+id));

		m.setLibelle(mDetails.getLibelle());
		m.setTypemaladie(mDetails.getTypemaladie());
		
		Maladie updatedM = repo.save(m);
		return ResponseEntity.ok(updatedM);
	}

	@DeleteMapping("/Maladies/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Maladie m = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Maladie avec cet ID : "+id));

		repo.delete(m);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}


}
