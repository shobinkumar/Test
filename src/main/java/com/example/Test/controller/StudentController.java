package com.example.Test.controller;

import com.example.Test.pojo.Student;
import com.example.Test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student studentData = studentService.saveStudent(student);
        return new ResponseEntity<>(studentData, HttpStatus.CREATED);
    }

    @GetMapping("/getStudent/{stu_id}")
    public ResponseEntity<Student> getStudentBasedOnId(@PathVariable("stu_id") int studentId) {
        return new ResponseEntity<>(studentService.getStudent(studentId),HttpStatus.OK);
    }

    @GetMapping("/getStudentList")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }


}
