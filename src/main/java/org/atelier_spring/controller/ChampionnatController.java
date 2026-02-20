package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.IChamionnatRepository;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ChampionnatController {

    IChamionnatRepository chamionnatRepository;
}
