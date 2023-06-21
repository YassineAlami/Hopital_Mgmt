package com.hopital.web;

import com.hopital.entities.Rendez_Vous;
import com.hopital.exception.ResourceNotFoundException;
import com.hopital.service.RendezVouService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RendezVousController {
    @NonNull
    private RendezVouService repo;
    @GetMapping("/RendezVous")
    public Rendez_Vous getRendezVous(long aLong){
        return repo.findById(aLong).get();
    }

    @GetMapping("/RendezVouss")
    public List<Rendez_Vous> getAllRendezVous()
    {
        return repo.findAll();
    }

    @PostMapping("/AddRendezVous")
    public Rendez_Vous createRendezVous(@RequestBody Rendez_Vous rdv)
    {
        return repo.save(rdv);
    }

    @GetMapping("/RendezVous/{id}")
    public ResponseEntity<Rendez_Vous> getRendezVousById(@PathVariable Long id)
    {
        return ResponseEntity.ok(repo.findById(id).get());
    }

    @PutMapping("updateRendezVous/{id}")
    public ResponseEntity<Rendez_Vous> updateRendezVous (@PathVariable Long id,@RequestBody Rendez_Vous rdvDetails)
    {
        Rendez_Vous rdv = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Pas de Rendez_Vous avec cet ID : "+id));
        rdv.setDaterdv(rdvDetails.getDaterdv());
        rdv.setHeurerdv(rdvDetails.getHeurerdv());
        rdv.setConfirmed(rdvDetails.isConfirmed());
        rdv.setPatient(rdvDetails.getPatient());

        Rendez_Vous updatedRendez_Vous =  repo.save(rdv);
        return ResponseEntity.ok(updatedRendez_Vous);
    }

    @DeleteMapping("DeleteRendezVous/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteRendezVous (@PathVariable Long id)
    {
        repo.deleteById(id);
        Map<String, Boolean> reponse = new HashMap<>();
        reponse.put("Deleted", Boolean.TRUE);
        return ResponseEntity.ok(reponse);
    }
}
