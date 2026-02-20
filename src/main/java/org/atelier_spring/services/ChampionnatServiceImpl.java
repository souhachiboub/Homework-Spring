package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.IChamionnatRepository;
import org.atelier_spring.repositories.IDetailChampionnatRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChampionnatServiceImpl implements IChampionnatService{

    IChamionnatRepository chamionnatRepository;
}
