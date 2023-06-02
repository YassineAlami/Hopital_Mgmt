package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.MedecinService;
import com.hopital.service.SpecialiteService;
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
import com.hopital.entities.Medecin;
import com.hopital.entities.Specialite;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class MedecinController 
{
	@NonNull
	private MedecinService repo;
	@NonNull
	private SpecialiteService sprepo;
	
	@GetMapping("/Medecins")
	public List<Medecin> getAllMedecins()
	{
		return repo.findAll();
	}
	
	@PostMapping("/Medecins/{idsp}")
	public Medecin createMedecin(@RequestBody Medecin med, @PathVariable long idsp)
	{
		Specialite sp = sprepo.findById(idsp).orElseThrow(()-> new ResourceNotFoundException("Pas de Specialite avec cet ID : "+idsp));
		
		med.setSpecialite(sp);
		
		return repo.save(med);
	}
	
	@GetMapping("/Medecins/{id}")
	public ResponseEntity <Medecin>  getMedecinById(@PathVariable Long id)
	{
		Medecin med = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Medecin avec cet ID : "+id));
		return ResponseEntity.ok(med);
	}
	
	@PutMapping("Medecins/{id}")
	public ResponseEntity<Medecin> updateMedecin (@PathVariable Long id,@RequestBody Medecin medDetails)
	{
		Medecin med = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Medecin avec cet ID : "+id));
		med.setNom(medDetails.getNom());
		med.setPrenom(medDetails.getPrenom());
		med.setEmail(medDetails.getEmail());
		med.setTel(medDetails.getTel());
		med.setGenre(medDetails.getGenre());
		med.setSpecialite(medDetails.getSpecialite());
		Medecin updatedMedecin =  repo.save(med);
		return ResponseEntity.ok(updatedMedecin);
	}
	@DeleteMapping("Medecins/{id}")
	public ResponseEntity<Map<String, Boolean> > deleteMedecin (@PathVariable Long id)
	{
		Medecin med = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Medecin avec cet ID : "+id));
		repo.delete(med);
		Map<String, Boolean> reponse = new HashMap<>();
		reponse.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(reponse);	
	}
	
}
