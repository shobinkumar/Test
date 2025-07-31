package com.example.Test.service;


import com.example.Test.dao.StudentDAO;
import com.example.Test.pojo.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    StudentDAO studentDAO;

    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void initialSetup()
    {
    }

    @Test
    void getStudentByIdTest()
    {
        when(studentDAO.getStudentById(anyInt())).thenReturn(getStudentData().get(0));
        Assertions.assertEquals("shobin" ,studentService.getStudent(0).getName());
    }

    private List<Student> getStudentData()
    {
        List<Student> studentList=new ArrayList<>();
        Student student=new Student();
        student.setStu_id(1);
        student.setName("shobin");
        studentList.add(student);
        return studentList;
    }
}
