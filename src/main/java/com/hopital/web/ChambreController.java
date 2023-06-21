package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.hopital.service.ChambreService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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

import com.hopital.entities.Chambre;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IChambre;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ChambreController
{
	@NonNull
	private ChambreService repo;

	@GetMapping("/Chambres")
	public List<Chambre> getAllChambres()
	{
		return repo.findAll();
	}
	
	@PostMapping("/AddChambres")
	public Chambre createChambre(@RequestBody Chambre ch)
	{
		return repo.save(ch);
	}
	
	@GetMapping("/Chambres/{id}")
	public ResponseEntity<Chambre> getChambreById(@PathVariable long id)
	{
		Chambre ch = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Chambre avec cet ID : "+id));
		return ResponseEntity.ok(ch);
	}	
	
	@PutMapping("/Chambres/{id}")
	public ResponseEntity<Chambre> updateChambre (@RequestBody Chambre chDetails,@PathVariable long id) 
	{
		Chambre ch = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Chambre avec cet ID : "+id));
		ch.setNum(chDetails.getNum());
		ch.setType(chDetails.getType());
		Chambre updatedCh = repo.save(ch);
		return ResponseEntity.ok(updatedCh);
	}
	
	@DeleteMapping("/Chambres/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteChambre (@PathVariable long id)
	{
		Chambre ch = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Chambre avec cet ID : "+id));
		repo.delete(ch);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
