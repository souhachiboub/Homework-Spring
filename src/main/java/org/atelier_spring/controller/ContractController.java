package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Contrat;
import org.atelier_spring.services.IContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class ContractController {


    IContractService contractService;

    @PostMapping
    public Contrat ajouterContratEtAffecterASponsorEtEquipe(@RequestParam("contract") Contrat contrat,@RequestParam("idEquipe") Long idEquipe,@RequestParam("idSponsor") Long idSponsor){
        return contractService.ajouterContratEtAffecterASponsorEtEquipe(contrat,idEquipe,idSponsor);
    }
}
