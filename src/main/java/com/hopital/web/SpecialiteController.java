package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.hopital.entities.Specialite;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class SpecialiteController 
{
	@NonNull
	private SpecialiteService repo;
	
	@GetMapping("/Specialites")
	public List<Specialite> getSpecialite()
	{
		return repo.findAll();
	}

	@PostMapping("/AddSpecialites")
	public Specialite createSpecialite (@RequestBody Specialite s)
	{
		return repo.save(s);
	}

	@GetMapping("/Specialites/{id}")
	public ResponseEntity<Specialite> getSpecialiteById(@PathVariable long id)
	{
		Specialite s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Specialite avec cet ID : "+id));

		return ResponseEntity.ok(s);
	}

	@PutMapping("/Specialites/{id}")
	public ResponseEntity<Specialite> updateSpacialite (@RequestBody Specialite mDetails, @PathVariable long id)
	{
		Specialite s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Specialite avec cet ID : "+id));
		s.setLibelle(mDetails.getLibelle());
		Specialite updatedS = repo.save(s);
		return ResponseEntity.ok(updatedS);
	}

	@DeleteMapping("/Specialites/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteSpecialite (@PathVariable long id)
	{
		Specialite s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Specialite avec cet ID : "+id));
		repo.delete(s);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

	

}
