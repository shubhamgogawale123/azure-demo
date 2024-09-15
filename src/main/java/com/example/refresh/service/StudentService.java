package com.example.refresh.service;

import com.example.refresh.model.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student findById(Long id);

    List<Student> findALL();

    Student updateStudent(Student student);

    String deleteStudentById(Long id);
}
