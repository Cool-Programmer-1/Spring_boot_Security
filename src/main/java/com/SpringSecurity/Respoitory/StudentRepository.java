package com.SpringSecurity.Respoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringSecurity.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional query methods (if needed) can be defined here
}
