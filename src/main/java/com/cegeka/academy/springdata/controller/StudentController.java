package com.cegeka.academy.springdata.controller;

import com.cegeka.academy.springdata.dao.StudentRepository;
import com.cegeka.academy.springdata.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("add/{name}/{passNr}")
    @Transactional
    public void insert(@PathVariable String name, @PathVariable String passNr) {
        Student student = new Student();
        student.setName(name);
        student.setPassportNumber(passNr);

        studentRepository.save(student);
    }

    @RequestMapping("list")
    @Transactional
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @RequestMapping("filter/{name}")
    @Transactional
    public Iterable<Student> findByName(@PathVariable String name) {
        return studentRepository.findByName(name);
    }
}
