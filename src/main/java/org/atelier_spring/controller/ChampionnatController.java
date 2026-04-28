package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.atelier_spring.dto.PiloteDTO;
import org.atelier_spring.repositories.IChamionnatRepository;
import org.atelier_spring.services.IChampionnatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/championnat")
public class ChampionnatController {

    private IChampionnatService championnatService;

    @GetMapping
    public List<PiloteDTO>  listWinners(Integer annee){
        return championnatService.listeWinners(annee);
    }




}
