package com.application2.application2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {
    @PostMapping("/student/save")
    public Student save(Student student)
    {
        student.setFirstName("Sakthi");
        student.setLastName("Vel");
        student.setGraduation("B.E");
        return student;
    }
}
