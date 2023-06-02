package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.DossierMedicalService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hopital.entities.DossierMedical;
import com.hopital.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class DossierMedicalController
{
	@NonNull
	private DossierMedicalService repo;
	
	@GetMapping("/DossiersMedicaux")
	public List<DossierMedical> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/AddDossiersMedicaux")
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
