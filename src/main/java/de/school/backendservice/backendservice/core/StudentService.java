package de.school.backendservice.backendservice.core;

import de.school.backendservice.backendservice.model.IdMismatchException;
import de.school.backendservice.backendservice.model.Student;
import de.school.backendservice.backendservice.ports.PersistancePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {
    private PersistancePort persistancePort;

    @Autowired
    public Student getStudent(String id) {
        return persistancePort.readStudent(id);
    }

    public Student createStudent(Student student) {
        UUID uuid = UUID.randomUUID();
        student.setId(uuid.toString());
        return persistancePort.createStudent(student);
    }

    public void updateStudent(String id, Student student) {
        persistancePort.readStudent(id);
        checkId(id, student.getId());
        persistancePort.updateStudent(id, student);
    }

    private void checkId(String id, String id2) {
        if(!id.equals(id2)) {
            throw new IdMismatchException("Exception: ID's passen nicht zusammen.");
        }
    }
}
