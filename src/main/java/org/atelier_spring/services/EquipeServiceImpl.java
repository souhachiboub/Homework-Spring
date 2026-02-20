package org.atelier_spring.services;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Equipe;
import org.atelier_spring.repositories.IEquipeRepository;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService{

    IEquipeRepository equipeRepository;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return null;
    }
}
