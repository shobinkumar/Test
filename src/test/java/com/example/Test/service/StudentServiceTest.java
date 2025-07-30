package com.example.Test.service;


import com.example.Test.dao.StudentDAO;
import com.example.Test.pojo.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    @Mock
    StudentDAO studentDAO;

    StudentService studentService;

    @BeforeEach
    void initialSetup()
    {
        studentService=new StudentService();
    }

    @Test
    void getStudentByIdTest()
    {
        getStudentData();
        when(studentDAO.getStudentById(any())).thenReturn(getStudentData().get(0));
        studentService.
        Assertions.assertEquals("shobin" ,);
    }

    private List<Student> getStudentData()
    {
        List<Student> studentList=new ArrayList<>();
        Student student=new Student();
        student.setStu_id(1);
        student.setName("shobin");
        studentList.add(student);
    }
}
