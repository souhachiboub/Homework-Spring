package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Equipe;
import org.atelier_spring.entities.Pilote;
import org.atelier_spring.services.IPiloteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pilotes")
@AllArgsConstructor
public class PiloteController {
    IPiloteService piloteService;

    @PostMapping
    public Pilote addPilote(@RequestBody Pilote pilote){
        return piloteService.addPilote(pilote);    }

    @PutMapping
    public  Pilote affecterPiloteEquipe(@RequestParam("libelleP") String libelleP,@RequestParam("libelleEq") String libelleEq){
        return piloteService.affecterPiloteEquipe(libelleP,libelleEq);
    }
}
