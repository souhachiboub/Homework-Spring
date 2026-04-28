package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.DetailChampionnat;
import org.atelier_spring.services.IDetailChampionnatService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("/detailchampionnat")
public class DetailChampionnatController {
    IDetailChampionnatService detailChampionnatService;

    @PostMapping
    public DetailChampionnat ajouterEtAffecterDetailChampionnat(@RequestParam("dc") DetailChampionnat dc,@RequestParam("idCh") Long idCh){
        return detailChampionnatService.ajouterEtAffecterDetailChampionnat(dc,idCh);
    }
}
