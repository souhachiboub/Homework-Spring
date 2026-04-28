package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.dto.ContratDto;
import org.atelier_spring.entities.Contrat;
import org.atelier_spring.services.IContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContractController {


    IContractService contractService;

    @PostMapping
    public Contrat ajouterContratEtAffecterASponsorEtEquipe(@RequestParam("contract") Contrat contrat,@RequestParam("idEquipe") Long idEquipe,@RequestParam("idSponsor") Long idSponsor){
        return contractService.ajouterContratEtAffecterASponsorEtEquipe(contrat,idEquipe,idSponsor);
    }

    @PostMapping("/ajouter")
    public ContratDto ajoutContratEtAffecterASponsorEtEquipe(
            Contrat contrat,
            String libelleEquipe,
            String nomSponsor,
            String pays){
        return contractService.ajoutContratEtAffecterASponsorEtEquipe(contrat,libelleEquipe,nomSponsor,pays);
    }
}
