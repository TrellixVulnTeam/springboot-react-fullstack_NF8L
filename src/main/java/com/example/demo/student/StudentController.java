package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }

    @PostMapping
    public void addstudent(@Valid @RequestBody Student student){
        studentService.addStudent(student);

    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("student") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
