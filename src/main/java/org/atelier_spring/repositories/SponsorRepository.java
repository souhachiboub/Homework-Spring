package org.atelier_spring.repositories;

import org.atelier_spring.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor,Long> {

    Sponsor findByNomAndPays(String nom, String pays);

}
