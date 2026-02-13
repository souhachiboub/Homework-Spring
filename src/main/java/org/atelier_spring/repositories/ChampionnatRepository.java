package org.atelier_spring.repositories;

import org.atelier_spring.entities.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {
}
