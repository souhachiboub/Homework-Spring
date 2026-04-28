package org.atelier_spring.services;

import org.atelier_spring.entities.Contrat;

public interface IContractService {
    Contrat ajouterContratEtAffecterASponsorEtEquipe(Contrat contrat,Long idEquipe,Long idSponsor);
}
