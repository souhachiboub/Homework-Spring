package org.atelier_spring.repositories;

import org.atelier_spring.dto.PiloteDTO;
import org.atelier_spring.entities.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChamionnatRepository extends JpaRepository<Championnat,Long> {
    @Query("SELECT new org.atelier_spring.dto.PiloteDTO(p.nom, p.prenom, e.nom, c.annee) " +
            "FROM Championnat c " +
            "JOIN c.winner p " +
            "JOIN p.equipe e " +
            "WHERE c.annee > :annee")
    List<PiloteDTO> findWinnersAfterYear(@Param("annee") Integer annee);
}
