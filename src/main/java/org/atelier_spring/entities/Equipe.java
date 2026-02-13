package org.atelier_spring.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe;
    private String libelle;
    private int nbPointsTotal;

    private int classementGeneral;

    @OneToMany(mappedBy = "equipe")
    private List<Pilote> pilotes;

    @OneToMany(mappedBy = "equipe")
    private List<Contrat>  contracts;



}
