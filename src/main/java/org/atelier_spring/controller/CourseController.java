package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.services.ICourseService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class CourseController {
    ICourseService courseService;

    @PostMapping
    public String ajoutercourseEtAffecterSponsor(@RequestParam ("idCourse")Long idCourse,@RequestParam("idChampionnat")Long idChampionnat){
        return courseService.affecterCourseAChamionnat(idCourse,idChampionnat);
    }
}
