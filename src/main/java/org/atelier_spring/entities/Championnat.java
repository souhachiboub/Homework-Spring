package org.atelier_spring.entities;


import jakarta.persistence.*;

@Entity
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChamionnat;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    private String libelleC;
    private int annee;

}
