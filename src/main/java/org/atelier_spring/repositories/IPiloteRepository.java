package org.atelier_spring.repositories;

import org.atelier_spring.dto.PiloteDTO;
import org.atelier_spring.entities.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPiloteRepository  extends JpaRepository<Pilote,Long> {
    Pilote findByLibelleP(String libelle);

}
