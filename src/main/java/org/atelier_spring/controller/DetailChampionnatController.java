package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.services.IDetailChampionnatService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
@AllArgsConstructor
public class DetailChampionnatController {
    IDetailChampionnatService detailChampionnatService;
}
