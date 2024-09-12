package com.SpringSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringSecurity.Model.Student;
import com.SpringSecurity.Service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable long id) {
        return studentService.updateStudent(student, id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }
}
