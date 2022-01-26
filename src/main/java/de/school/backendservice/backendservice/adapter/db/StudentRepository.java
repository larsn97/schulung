package de.school.backendservice.backendservice.adapter.db;

import de.school.backendservice.backendservice.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends CrudRepository<Student, String>{
}
