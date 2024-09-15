package com.example.refresh.serviceimpl;

import com.example.refresh.dao.StudentRepository;
import com.example.refresh.model.Student;
import com.example.refresh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseGet(()->new Student());
    }

    @Override
    public List<Student> findALL() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Student s=findById(student.getId());
        if(Objects.nonNull(s)){
            s.setFirstName(student.getFirstName());
            s.setLastName(student.getLastName());
            return studentRepository.save(s);
        }
        return student;
    }

    @Override
    public String deleteStudentById(Long id) {
        try {
            studentRepository.deleteById(id);
            return "Success";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
