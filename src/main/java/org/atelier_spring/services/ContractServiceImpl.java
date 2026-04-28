package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Contrat;
import org.atelier_spring.entities.Equipe;
import org.atelier_spring.entities.Sponsor;
import org.atelier_spring.repositories.IContractRepository;
import org.atelier_spring.repositories.IEquipeRepository;
import org.atelier_spring.repositories.SponsorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ContractServiceImpl implements IContractService{
       IContractRepository contractRepository;
       private final SponsorRepository sponsorRepository;
       private IEquipeRepository equipeRepository;

       @Override
       public Contrat ajouterContratEtAffecterASponsorEtEquipe(Contrat contrat, Long idEquipe, Long idSponsor) {
//              Sponsor sponsor=sponsorRepository.findBy(idSponsor);
//              Optional<Equipe> equipe=equipeRepository.findById(idEquipe);
//              contrat.setSponsor(sponsor);
//              contrat.setEquipe(equipe);
//              contractRepository.save(contrat);
              return contrat;
       }
}
