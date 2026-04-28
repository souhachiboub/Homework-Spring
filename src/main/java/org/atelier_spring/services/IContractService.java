package org.atelier_spring.services;

import org.atelier_spring.dto.ContratDto;
import org.atelier_spring.entities.Contrat;

public interface IContractService {
    Contrat ajouterContratEtAffecterASponsorEtEquipe(Contrat contrat,Long idEquipe,Long idSponsor);
    ContratDto ajoutContratEtAffecterASponsorEtEquipe(
            Contrat contrat,
            String libelleEquipe,
            String nomSponsor,
            String pays);
}
