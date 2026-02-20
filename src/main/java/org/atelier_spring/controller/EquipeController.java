package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.services.IEquipeService;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class EquipeController {
    IEquipeService equipeService;
}
