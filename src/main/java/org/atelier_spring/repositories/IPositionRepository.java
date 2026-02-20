package org.atelier_spring.repositories;

import org.atelier_spring.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Long> {
}
