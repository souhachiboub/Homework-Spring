package org.atelier_spring.controller;

import lombok.AllArgsConstructor;
import org.atelier_spring.services.ICourseService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
@AllArgsConstructor
public class CourseController {
    ICourseService courseService;
}
