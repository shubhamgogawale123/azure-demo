package com.example.refresh.controller;


import com.example.refresh.model.Student;
import com.example.refresh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/get")
    public Student getStudent(@RequestParam Long id){
        return studentService.findById(id);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){

        return studentService.findALL();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){

        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id){

        return studentService.deleteStudentById(id);
    }


}
