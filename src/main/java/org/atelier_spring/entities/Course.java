package org.atelier_spring.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCourse;
    private String emplacement;
    private LocalDate dateCourse;

   @OneToMany(mappedBy = "course")
    private List<Position> poistions;

   @ManyToMany
    private List<Championnat> championnats;
}
