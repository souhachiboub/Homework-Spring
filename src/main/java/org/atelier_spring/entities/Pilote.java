package org.atelier_spring.entities;


import jakarta.persistence.*;

import java.util.List;

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


    @ManyToOne
    private Equipe equipe;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;


}
