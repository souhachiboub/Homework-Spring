package org.atelier_spring.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "positions")  // THIS LINE IS CRITICAL
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_position")
    private Long idPosition;

    @Column(name = "classement")
    private Integer classement;

    @Column(name = "nb_points")
    private Integer nbPoints;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Pilote pilote;



}