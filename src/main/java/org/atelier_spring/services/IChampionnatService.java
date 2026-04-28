package org.atelier_spring.services;

import org.atelier_spring.dto.PiloteDTO;
import org.atelier_spring.entities.Championnat;

import java.util.List;

public interface IChampionnatService {
    Championnat addChamionnatAndAssociatedCourses(Championnat championnat);
    List<PiloteDTO> listeWinners(Integer annee);
}
