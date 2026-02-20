package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Sponsor;
import org.atelier_spring.services.ISponsorService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class SponsorController {
    ISponsorService sponsorService;


}
