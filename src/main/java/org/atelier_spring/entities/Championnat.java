package org.atelier_spring.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChamionnat;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    private String libelleC;
    private int annee;

    @ManyToMany(mappedBy = "championnats",fetch = FetchType.EAGER)
    private List<Course> courses;

    @OneToOne
    private DetailChampionnat detailChampionnatchampionnat;

}
