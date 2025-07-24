package com.example.Test.pojo;

import com.example.Test.enums.DeptEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int college_id;
    String collegeName;

    @OneToOne(mappedBy = "college")
            @JsonBackReference
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", collegeName='" + collegeName + '\'' +
                ", student=" + student +
                '}';
    }
}
