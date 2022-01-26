package de.school.backendservice.backendservice.ports;

import de.school.backendservice.backendservice.model.Student;

import java.util.List;

public interface PersistancePort {
    Student readAllStudents();

    Student readStudent(String id);

    Student createStudent(Student student);

    void updateStudent(String id, Student student);
}
