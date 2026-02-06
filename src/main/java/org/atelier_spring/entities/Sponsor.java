package org.atelier_spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSponsor;
    private String nom;
    private String pays;
    private float budgetAnnuel;
    private boolean bloquerContract;
}
