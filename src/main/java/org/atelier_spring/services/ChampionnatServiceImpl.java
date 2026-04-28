package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Championnat;
import org.atelier_spring.repositories.IChamionnatRepository;
import org.atelier_spring.repositories.IDetailChampionnatRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChampionnatServiceImpl implements IChampionnatService{

    IChamionnatRepository chamionnatRepository;


    @Override
    public Championnat addChamionnatAndAssociatedCourses(Championnat championnat) {
        return chamionnatRepository.save(championnat);
    }
}
