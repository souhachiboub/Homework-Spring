package org.atelier_spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
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

    Boolean archived;
    LocalDate dateCreation;
    LocalDate dateDerniereModification;
}
