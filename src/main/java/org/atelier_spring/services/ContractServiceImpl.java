package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.IContractRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContractServiceImpl implements IContractService{
       IContractRepository contractRepository;
}
