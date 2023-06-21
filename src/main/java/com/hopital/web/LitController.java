package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.hopital.service.ChambreService;
import com.hopital.service.LitManager;
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
import com.hopital.entities.Chambre;
import com.hopital.entities.Lit;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class LitController
{
	@NonNull
	private LitManager repo;
	@NonNull
	private ChambreService crepo;

	@GetMapping("/Lits")
	public List<Lit> getLit()
	{
		return repo.findAll();
	}

	@PostMapping("/Lits/{idch}")
	public Lit createLit (@RequestBody Lit l,@PathVariable long idch)
	{
		Chambre ch = crepo.findById(idch).orElseThrow(()-> new ResourceNotFoundException("Pas de Chanbre avec cet ID : "+idch));
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
	public ResponseEntity<Lit> updateLit (@RequestBody Lit lDetails, @PathVariable long id)
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