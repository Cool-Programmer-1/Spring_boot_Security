package com.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringSecurity.Model.Student;
import com.SpringSecurity.Respoitory.StudentRepository;

import java.util.List;

@Service
public class StudentService {
	

    @Autowired
    private StudentRepository studentRepository;

    // Save a new student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update an existing student
    public Student updateStudent(Student student, long id) {
        return studentRepository.save(student);
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Find student by ID
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Delete a student by ID
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
