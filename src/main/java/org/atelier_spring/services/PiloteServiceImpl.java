package org.atelier_spring.services;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Pilote;
import org.atelier_spring.repositories.IPiloteRepository;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PiloteServiceImpl implements IPiloteService{
    IPiloteRepository piloteRepository;
    @Override
    public Pilote addPilote(Pilote p) {
        return piloteRepository.save(p);
    }
}
