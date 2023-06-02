package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.ScannerService;
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
import com.hopital.entities.Scanner;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ScannerController 
{
	@NonNull
	private ScannerService repo;

	@GetMapping("/Scanners")
	public List<Scanner> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Scanners")
	public Scanner createLit (@RequestBody Scanner tv)
	{
		return repo.save(tv);
	}

	@GetMapping("/Scanners/{id}")
	public ResponseEntity<Scanner> getLitById(@PathVariable long id)
	{
		Scanner s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Scanner avec cet ID : "+id));

		return ResponseEntity.ok(s);
	}

	@PutMapping("/Scanners/{id}")
	public ResponseEntity<Scanner> updateChambre (@RequestBody Scanner sDetails, @PathVariable long id) 
	{
		Scanner s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Scanner avec cet ID : "+id));

		s.setLibelle(sDetails.getLibelle());

		Scanner updatedS = repo.save(s);
		return ResponseEntity.ok(updatedS);
	}

	@DeleteMapping("/Scanners/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Scanner s = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Scanner avec cet ID : "+id));

		repo.delete(s);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
