package org.atelier_spring.services;


import lombok.AllArgsConstructor;
import org.atelier_spring.entities.Championnat;
import org.atelier_spring.entities.Course;
import org.atelier_spring.repositories.ChampionnatRepository;
import org.atelier_spring.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService{
    ICourseRepository courseRepository;
    private final ChampionnatRepository championnatRepository;

    @Override
    public String affecterCourseAChamionnat(Long idCourse, Long idChampionnat) {
        Course course=courseRepository.findById(idCourse).get();
        Championnat ch=championnatRepository.findById(idChampionnat).get();
        List<Championnat> championnatList=new ArrayList<>();
        if(course.getChampionnats()!=null){
            championnatList = course.getChampionnats();
        }
       // championnatList.add(course);
        course.setChampionnats(championnatList);
        courseRepository.save(course);
        return "Sucess ";

    }
}
