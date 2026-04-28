package org.atelier_spring.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PiloteDTO {
    private String nom;
    private String prenom;
    private String equipe;
    private Integer anneeChampionnat;


}
