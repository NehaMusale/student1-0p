 package com.springrest.springrest.controller;

import com.springrest.springrest.entity.student;
import com.springrest.springrest.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentcontroller {

    @Autowired
    private studentservice service;

    @PostMapping("/addstudent")
    public student addstudent(@RequestBody student student) {
        return service.savestudent(student);
    }

    @PostMapping("/addstudents")
    public List<student> addstudent(@RequestBody List<student> student) {
        return service.savestudent(student);
    }

    @GetMapping("/student")
    public List<student> findAllstudent() {
        return service.getstudent();
    }

    @GetMapping("/studentById/{id}")
    public student findstudentById(@PathVariable int id) {
        return service.getstudentById(id);
    }

    @GetMapping("/student/{name}")
    public student findstudentByName(@PathVariable String name) {
        return service.getstudentByName(name);
    }

    @PutMapping("/update")
    public student updatestudent(@RequestBody student student) {
        return service.updatestudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deletestudent(@PathVariable int id) {
        return service.deletestudent(id);
    }
}