package org.atelier_spring.repositories;

import org.atelier_spring.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Long> {
}
