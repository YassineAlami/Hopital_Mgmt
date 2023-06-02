package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.DossierMedicalService;
import com.hopital.service.HospitalisationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hopital.entities.DossierMedical;
import com.hopital.entities.Hospitalisation;
import com.hopital.exception.ResourceNotFoundException;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class HospitalisationController 
{
	@NonNull
	private HospitalisationService repo;
	@NonNull
	private DossierMedicalService dmrepo;
	
	
	@GetMapping("/Hospitalisations")
	public List<Hospitalisation> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Hospitalisations/{iddm}")
	public Hospitalisation createDossierMedical (@RequestBody Hospitalisation h, @PathVariable long iddm)
	{
		DossierMedical dm = dmrepo.findById(iddm).orElseThrow(()-> new ResourceNotFoundException("Pas de Dossier Medical avec cet ID : "+iddm));
		
		h.setDossiermedical(dm);
		
		return repo.save(h);
	}

	@GetMapping("/Hospitalisations/{id}")
	public ResponseEntity<Hospitalisation> getLitById(@PathVariable long id)
	{
		Hospitalisation h = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Hospitalisation avec cet ID : "+id));

		return ResponseEntity.ok(h);
	}

	@PutMapping("/Hospitalisations/{id}")
	public ResponseEntity<Hospitalisation> updateChambre (@RequestBody Hospitalisation hDetails, @PathVariable long id) 
	{
		Hospitalisation h = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Hospitalisation avec cet ID : "+id));

		h.setDateEntree(hDetails.getDateEntree());
		h.setDateSortie(hDetails.getDateSortie());
		h.setDossiermedical(hDetails.getDossiermedical());
		
		Hospitalisation updatedH = repo.save(h);
		return ResponseEntity.ok(updatedH);
	}

	@DeleteMapping("/Hospitalisations/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Hospitalisation h = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Hospitalisation avec cet ID : "+id));

		repo.delete(h);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
