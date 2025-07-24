package com.example.Test.pojo;

import com.example.Test.enums.DeptEnum;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int stu_id;
    String name;
    @Enumerated(EnumType.STRING)
    DeptEnum dept;

    @OneToOne(cascade = CascadeType.ALL)
            @JoinColumn(name =  "college_id")
            @JsonManagedReference
    College college;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeptEnum getDept() {
        return dept;
    }

    public void setDept(DeptEnum dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", college=" + college +
                '}';
    }
}
