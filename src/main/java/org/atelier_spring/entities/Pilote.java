package org.atelier_spring.entities;


import jakarta.persistence.*;

@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPilote;
    private String libelleP;
    private int nbPOintsTotal;
    private int classementGeneral;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;
}
