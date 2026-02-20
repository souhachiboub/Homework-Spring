package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.IDetailChampionnatRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetailChampionnatServiceImpl  implements IDetailChampionnatService{

    IDetailChampionnatRepository detailChampionnatRepository;
}
