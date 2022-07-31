 package com.springrest.springrest.service;

import com.springrest.springrest.entity.student;
import com.springrest.springrest.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {
    @Autowired
    private studentrepository repository;

    public student savestudent(student student) {
        return repository.save(student);
    }

    public List<student> savestudent(List<student> student) {
        return repository.saveAll(student);
    }

    public List<student> getstudent() {
        return repository.findAll();
    }

    public student getstudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public student getstudentByName(String name) {
        return repository.findByName(name);
    }

    public String deletestudent(int id) {
        repository.deleteById(id);
        return "student removed !! " + id;
    }

    public student updatestudent(student student) {
        student existingstudent = repository.findById(student.getId()).orElse(null);
        existingstudent.setName(student.getName());
        return repository.save(existingstudent);
    }
}
