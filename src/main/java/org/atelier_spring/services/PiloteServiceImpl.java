package org.atelier_spring.services;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Pilote;
import org.atelier_spring.repositories.IPositionRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PiloteServiceImpl implements IPiloteService{
    IPositionRepository piloteRepository;
    @Override
    public String addPilote(Pilote p) {
        return null;
    }
}
