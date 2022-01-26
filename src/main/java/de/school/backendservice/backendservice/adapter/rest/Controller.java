package de.school.backendservice.backendservice.adapter.rest;

import de.school.backendservice.backendservice.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return null;
    }
}
