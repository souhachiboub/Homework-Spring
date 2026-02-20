package org.atelier_spring.repositories;

import org.atelier_spring.entities.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChamionnatRepository extends JpaRepository<Championnat,Long> {
}
