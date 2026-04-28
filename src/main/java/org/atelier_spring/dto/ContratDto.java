package org.atelier_spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class ContratDto {
    private long idContract;
    private float montant;
    private String annee;
    private boolean archived;
    private String equipe;
    private String sponsor;
}
