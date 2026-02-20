package org.atelier_spring.repositories;

import org.atelier_spring.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEquipeRepository extends JpaRepository<Equipe,Long> {
}
