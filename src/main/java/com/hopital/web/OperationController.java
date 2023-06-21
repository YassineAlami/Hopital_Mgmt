package com.hopital.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hopital.service.OperationService;
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
import com.hopital.entities.Operation;
import com.hopital.exception.ResourceNotFoundException;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class OperationController 
{
	@NonNull
	private OperationService repo;
		
	@GetMapping("/Operations")
	public List<Operation> getOperation()
	{
		return repo.findAll();
	}

	@PostMapping("/AddOperations")
	public Operation createOperation (@RequestBody Operation o)
	{
		return repo.save(o);
	}

	@GetMapping("/Operations/{id}")
	public ResponseEntity<Operation> getOperationById(@PathVariable long id)
	{
		Operation o = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Operation avec cet ID : "+id));

		return ResponseEntity.ok(o);
	}

	@PutMapping("/Operations/{id}")
	public ResponseEntity<Operation> updateOperation (@RequestBody Operation oDetails, @PathVariable long id)
	{
		Operation o = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Operation avec cet ID : "+id));
		o.setLibelle(oDetails.getLibelle());
		Operation updatedO = repo.save(o);
		return ResponseEntity.ok(updatedO);
	}

	@DeleteMapping("/Operations/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteOperation (@PathVariable long id)
	{
		Operation o = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Operation avec cet ID : "+id));
		repo.delete(o);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
