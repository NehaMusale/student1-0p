package com.springrest.springrest.repository;

import com.springrest.springrest.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<student,Integer> {
    student findByName(String name);
}

