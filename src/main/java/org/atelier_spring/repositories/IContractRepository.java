package org.atelier_spring.repositories;

import org.atelier_spring.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface IContractRepository extends JpaRepository<Contrat,Long> {
}
