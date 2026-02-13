package org.atelier_spring.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSponsor;
    private String nom;
    private String pays;
    private float budgetAnnuel;
    private boolean bloquerContract;

    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contrats;
}
