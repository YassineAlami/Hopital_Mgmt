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

import com.hopital.entities.Chambre;
import com.hopital.entities.Lit;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IChambre;
import com.hopital.repo.ILit;

@RestController
@RequestMapping("/api/v1")
public class LitController
{
	@Autowired
	private ILit repo;
	
	@Autowired
	private IChambre chrepo;

	@GetMapping("/Lits")
	public List<Lit> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Lits/{idch}")
	public Lit createLit (@RequestBody Lit l,@PathVariable long idch)
	{
		Chambre ch = chrepo.findById(idch).orElseThrow(()-> new ResourceNotFoundException("Pas de Chanbre avec cet ID : "+idch));
		
		l.setChambre(ch);
		
		return repo.save(l);
	}

	@GetMapping("/Lits/{id}")
	public ResponseEntity<Lit> getLitById(@PathVariable long id)
	{
		Lit l = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Lit avec cet ID : "+id));

		return ResponseEntity.ok(l);
	}

	@PutMapping("/Lits/{id}")
	public ResponseEntity<Lit> updateChambre (@RequestBody Lit lDetails, @PathVariable long id) 
	{
		Lit l = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Lit avec cet ID : "+id));

		l.setNum(lDetails.getNum());
		l.setSipris(lDetails.isSipris());
		l.setChambre(lDetails.getChambre());

		Lit updatedL = repo.save(l);
		return ResponseEntity.ok(updatedL);
	}

	@DeleteMapping("/Lits/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLit (@PathVariable long id)
	{
		Lit l = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Lit avec cet ID : "+id));

		repo.delete(l);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}