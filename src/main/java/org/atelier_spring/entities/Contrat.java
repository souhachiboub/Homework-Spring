package org.atelier_spring.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContract;
    private float montant;
    private  String annee;
    private boolean archived;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Sponsor sponsor;

}
