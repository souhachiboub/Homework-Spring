package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService{
    ICourseRepository courseRepository;
}
