package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.PatientService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hopital.entities.Patient;
import com.hopital.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PatentController 
{
	@NonNull
	private PatientService repo;

	@GetMapping("/Patient")
	public Patient getPatient(long aLong){
		return repo.findById(aLong).get();
	}

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
		return ResponseEntity.ok(repo.findById(id).get());
	}
	
	@PutMapping("updatePatients/{id}")
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
	
	@DeleteMapping("DeletePatients/{id}")
	public ResponseEntity<Map<String, Boolean> > deletePatient (@PathVariable Long id)
	{
		repo.deleteById(id);
		Map<String, Boolean> reponse = new HashMap<>();
		reponse.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(reponse);
	}
	
}
