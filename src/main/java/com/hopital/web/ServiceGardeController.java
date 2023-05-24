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

import com.hopital.entities.ServiceGarde;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IServiceGarde;

@RestController
@RequestMapping("api/v1")
public class ServiceGardeController 
{
	@Autowired
	private IServiceGarde repo;
	
	@GetMapping("/ServicesGardes")
	public List<ServiceGarde> getAllServicesGardes()
	{
		return repo.findAll();
	}
	
	@PostMapping("/AddServicesGardes")
	public ServiceGarde createServiceGarde (@RequestBody ServiceGarde sg)
	{
		return repo.save(sg);
	}

	@GetMapping("/ServicesGardes/{id}")
	public ResponseEntity<ServiceGarde> getServiceGardeById(@PathVariable long id)
	{
		ServiceGarde o = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Service de Garde avec cet ID : "+id));

		return ResponseEntity.ok(o);
	}

	@PutMapping("/ServicesGardes/{id}")
	public ResponseEntity<ServiceGarde> updateServiceGarde (@RequestBody ServiceGarde sgDetails, @PathVariable long id) 
	{
		ServiceGarde sg = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Service de Garde avec cet ID : "+id));

		sg.setDateservice(sgDetails.getDateservice());

		ServiceGarde updatedSg = repo.save(sg);
		return ResponseEntity.ok(updatedSg);
	}

	@DeleteMapping("/ServicesGardes/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteServiceGarde (@PathVariable long id)
	{
		ServiceGarde sg = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Service de Garde avec cet ID : "+id));

		repo.delete(sg);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
