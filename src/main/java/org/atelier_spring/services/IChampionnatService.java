package org.atelier_spring.services;

import org.atelier_spring.entities.Championnat;

public interface IChampionnatService {
    Championnat addChamionnatAndAssociatedCourses(Championnat championnat);
}
