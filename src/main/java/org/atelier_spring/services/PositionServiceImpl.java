package org.atelier_spring.services;

import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.IPositionRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PositionServiceImpl implements IPositionService{
    IPositionRepository positionRepository;
}
