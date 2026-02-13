package org.atelier_spring.repositories;

import org.atelier_spring.entities.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPiloteService extends JpaRepository<Pilote,Long> {
}
