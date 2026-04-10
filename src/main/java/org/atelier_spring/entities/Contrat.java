package org.atelier_spring.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
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
