package org.atelier_spring.services;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Equipe;
import org.atelier_spring.entities.Pilote;
import org.atelier_spring.repositories.IEquipeRepository;
import org.atelier_spring.repositories.IPiloteRepository;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PiloteServiceImpl implements IPiloteService{
    private final IPiloteRepository piloteRepository;
    private final IEquipeRepository equipeRepository;
    @Override
    public Pilote addPilote(Pilote p) {
        return piloteRepository.save(p);
    }

    @Override
    public Pilote affecterPiloteEquipe(String libelleP, String libelleEq) {
        Pilote p=piloteRepository.findByLibelleP(libelleP);
        Equipe eq=equipeRepository.findByLibelle(libelleEq);
        p.setEquipe(eq);
        piloteRepository.save(p);
        return p;
    }


}
