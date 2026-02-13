package org.atelier_spring.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChamionnat;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    private String libelleC;
    private int annee;

    @ManyToMany(mappedBy = "championnats")
    private List<Course> courses;

}
