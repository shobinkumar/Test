package com.example.Test.dao;

import com.example.Test.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer> {

    @Query("SELECT stu from Student stu WHERE stu.stu_id = :student_id")
    Student getStudentById(@Param("student_id") int student_id);


    @Query("SELECT stu from Student stu")
    List<Student> getStudentList();
}
