package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.dto.ContratDto;
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

       public ContratDto ajoutContratEtAffecterASponsorEtEquipe(
               Contrat contrat,
               String libelleEquipe,
               String nomSponsor,
               String pays) {

              Equipe equipe = equipeRepository.findByLibelle(libelleEquipe);
              Sponsor sponsor = sponsorRepository.findByNomAndPays(nomSponsor, pays);

              // affectation
              contrat.setEquipe(equipe);
              contrat.setSponsor(sponsor);

              Contrat saved = contractRepository.save(contrat);

              // ✅ Mapping correct
              return new ContratDto(
                      saved.getIdContract(),        // ✔ correct
                      saved.getMontant(),           // ✔ from entity
                      saved.getAnnee(),             // ✔ from entity
                      saved.isArchived(),           // ✔ boolean
                      equipe.getLibelle(),          // ✔ relation
                      sponsor.getNom()              // ✔ relation
              );
       }
}
