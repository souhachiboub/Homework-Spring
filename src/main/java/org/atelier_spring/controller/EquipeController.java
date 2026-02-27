package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Equipe;
import org.atelier_spring.services.IEquipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/equipes")
public class EquipeController {
    IEquipeService equipeService;

    @PostMapping
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.ajouterEquipe(equipe);
    }


}
