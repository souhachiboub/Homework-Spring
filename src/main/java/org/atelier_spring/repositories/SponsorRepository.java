package org.atelier_spring.repositories;

import org.atelier_spring.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SponsorRepository extends JpaRepository<Sponsor,Long> {

}
