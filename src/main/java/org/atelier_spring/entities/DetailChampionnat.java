package org.atelier_spring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailChamionnat;
    private String code;
    private String Description;

}
