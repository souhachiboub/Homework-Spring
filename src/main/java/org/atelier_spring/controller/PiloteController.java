package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.services.IPiloteService;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class PiloteController {
    IPiloteService piloteService;
}
