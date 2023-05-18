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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hopital.entities.DossierMedical;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IDossierMedical;

@RestController
@RequestMapping("api/v1")
public class DossierMedicalController
{
	@Autowired
	private IDossierMedical repo;
	
	@GetMapping("/DossiersMedicaux")
	public List<DossierMedical> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/DossiersMedicaux")
	public DossierMedical createDossier (@RequestBody DossierMedical dm)
	{
		return repo.save(dm);
	}

	@GetMapping("/DossiersMedicaux/{id}")
	public ResponseEntity<DossierMedical> getLitById(@PathVariable long id)
	{
		DossierMedical dm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Dossier Medical avec cet ID : "+id));

		return ResponseEntity.ok(dm);
	}

	@DeleteMapping("/DossiersMedicaux/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		DossierMedical dm = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Dossier Medical avec cet ID : "+id));

		repo.delete(dm);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
