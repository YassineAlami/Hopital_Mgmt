package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hopital.entities.Patient;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IPatient;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PatentController 
{
	@Autowired
	private IPatient repo;

	@GetMapping("/Patients")
	public List<Patient> getAllPatients()
	{
		return repo.findAll();
	}

	@PostMapping("/AddPatients")
	public Patient createPatient(@RequestBody Patient pt)
	{
		return repo.save(pt);
	}
	
	@GetMapping("/Patients/{id}")
	public ResponseEntity <Patient>  getPatientById(@PathVariable Long id)
	{
		Patient pt = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Patient avec cet ID : "+id));
		return ResponseEntity.ok(pt);
	}
	
	@PutMapping("Patients/{id}")
	public ResponseEntity<Patient> updatePatient (@PathVariable Long id,@RequestBody Patient ptDetails)
	{
		Patient pt = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Patient avec cet ID : "+id));
		
		pt.setNom(ptDetails.getNom());
		pt.setPrenom(ptDetails.getPrenom());
		pt.setEmail(ptDetails.getEmail());
		pt.setTel(ptDetails.getTel());
		pt.setGenre(ptDetails.getGenre());
		pt.setDatenaissance(ptDetails.getDatenaissance());
		
		Patient updatedPatient =  repo.save(pt);
		return ResponseEntity.ok(updatedPatient);
	}
	
	@DeleteMapping("Patients/{id}")
	public ResponseEntity<Map<String, Boolean> > deletePatient (@PathVariable Long id)
	{
		Patient pt = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Patient avec cet ID : "+id));
		
		repo.delete(pt);
		Map<String, Boolean> reponse = new HashMap<>();
		reponse.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(reponse);
	}
	
}
