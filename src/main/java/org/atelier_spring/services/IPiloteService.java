package org.atelier_spring.services;

import org.atelier_spring.entities.Pilote;

public interface IPiloteService {
    Pilote addPilote(Pilote p) ;

    Pilote affecterPiloteEquipe(String libelleP,String libelleEq);
}
