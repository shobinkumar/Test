package com.example.Test.service;

import com.example.Test.dao.StudentDAO;
import com.example.Test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;


    public Student saveStudent(Student student) {
        return studentDAO.save(student);
    }


    public Student getStudent(int studentId) {
        return studentDAO.getStudentById(studentId);
    }

    public List<Student> getStudentList() {
        return studentDAO.getStudentList();
    }
}
