package com.cegeka.academy.springdata.dao;

import com.cegeka.academy.springdata.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    /**
     * Find Students by name
     * @param name
     * @return
     */
    Iterable<Student> findByName(String name);
}
