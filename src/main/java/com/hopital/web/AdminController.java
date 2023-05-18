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

import com.hopital.entities.Admin;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.repo.IAdmin;

@RestController
@RequestMapping("/api/v1")
public class AdminController 
{
	@Autowired
	private IAdmin repo;
	
	@GetMapping("/Admins")
	public List<Admin> getAllAdmins ()
	{
		return repo.findAll();
	}
	
	@PostMapping("/Admins")
	public Admin CreateAdmin (@RequestBody Admin ad)
	{
		return repo.save(ad);
	}
	
	@GetMapping("/Admins/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable long id)
	{
		Admin ad = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Admin avec cet ID : "+id));
		return ResponseEntity.ok(ad);
	}
	
	@PutMapping("/Admins/{id}")
	public ResponseEntity<Admin> ubdateAdmin (@PathVariable long id,@RequestBody Admin adDetails)
	{
		Admin ad = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Admin avec cet ID : "+id));
		
		ad.setNom(adDetails.getNom());
		ad.setPrenom(adDetails.getPrenom());
		ad.setEmail(adDetails.getEmail());
		
		Admin updatedAdmin = repo.save(ad);
		return ResponseEntity.ok(updatedAdmin);
	}
	
	@DeleteMapping("/Admins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAdmin (@PathVariable long id)
	{
		Admin ad = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas d'Admin avec cet ID : "+id));
		
		repo.delete(ad);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
