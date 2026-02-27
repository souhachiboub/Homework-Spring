package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Sponsor;
import org.atelier_spring.services.ISponsorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sponsors")
public class SponsorController {
    ISponsorService sponsorService;

    @PostMapping
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }
    @GetMapping
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }
    @PutMapping
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }


    @DeleteMapping("/{id}")
    public void supprimerSponsor(@PathVariable Long id) {
        sponsorService.supprimerSponsor(id);
    }
    @PutMapping("/archive/{id}")
    public Boolean archiverSponsor(@PathVariable Long id) {
        return sponsorService.archiverSponsor(id);
    }


}
