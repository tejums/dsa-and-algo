package com.tejumvsr.learningboot.repository;

import com.tejumvsr.learningboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}