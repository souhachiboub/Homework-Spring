package org.atelier_spring.controller;


import lombok.AllArgsConstructor;
import org.atelier_spring.services.IContractService;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ContractController {


    IContractService contractService;
}
