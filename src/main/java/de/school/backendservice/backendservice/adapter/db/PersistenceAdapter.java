package de.school.backendservice.backendservice.adapter.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistenceAdapter {

    StudentRepository stundentRepository;

    @Autowired
    public PersistenceAdapter(StudentRepository stundentRepository) {
        this.stundentRepository = stundentRepository;
    }

}
