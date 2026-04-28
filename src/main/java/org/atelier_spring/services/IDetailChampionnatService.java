package org.atelier_spring.services;

import org.atelier_spring.entities.DetailChampionnat;

public interface IDetailChampionnatService {
    DetailChampionnat ajouterEtAffecterDetailChampionnat(DetailChampionnat dc, Long idCh);
}
