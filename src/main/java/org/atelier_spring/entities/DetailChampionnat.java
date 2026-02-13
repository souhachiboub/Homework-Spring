package org.atelier_spring.entities;


import jakarta.persistence.*;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailChamionnat;
    private String code;
    private String Description;

    @OneToOne
    private Championnat championnat;

}
